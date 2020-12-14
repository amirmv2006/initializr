package io.spring.initializr.generator.buildsystem.gradle

import io.spring.initializr.block
import io.spring.initializr.generator.buildsystem.MavenRepository
import io.spring.initializr.generator.buildsystem.MpsBuild
import io.spring.initializr.generator.io.IndentingWriter
import io.spring.initializr.generator.spring.build.gradle.LocoRepoGenerationConfig
import io.spring.initializr.locorepo.contributors.MpsProjectGenerationContext
import org.springframework.util.ClassUtils
import kotlin.streams.toList
import kotlin.text.Typography.dollar

class MpsBuildWriter(
    private val context: MpsProjectGenerationContext,
    private val isLang: Boolean
) : KotlinDslGradleBuildWriter() {

    override fun writeRepositories(writer: IndentingWriter?, build: GradleBuild?) {
        val projectRepos = (build as MpsBuild).projectRepositories.items().toList()
        writeNestedCollection(writer, "repositories", projectRepos) { repositoryAsString(it) }
    }

    override fun writeDependencies(writer: IndentingWriter, build: GradleBuild) {
        writer.println()
        writer.println("dependencies" + " {")
        writer.indented {
            writer.println("mps(mpsDistribution())")
            if (isLang) {
                writer.println("ant_lib(\"org.apache.ant:ant-junit:1.10.1\")")
            }
        }
        writer.println("}")
    }

    override fun writeJavaSourceCompatibility(writer: IndentingWriter?, settings: GradleBuildSettings?) {
        // no need, done in another way
    }

    private fun writePublishing(writer: IndentingWriter, build: GradleBuild) {
        writer.println(
            """
            publishing {
                publications {
                    maven(MavenPublication) {
                        artifact("build/artifacts/${context.projectDescription.artifactId}_Plugin/${context.projectQualifiedName()}.zip") {
                            extension 'zip'
                        }
                    }
                }
                repositories {
                    maven {
                        name 'nexus'
                        url repoUrl
                        credentials {
                            username project.repoUser
                            password project.repoPassword
                        }}
                }
            }
        """.trimIndent()
        )
    }

    override fun repositoryAsString(repository: MavenRepository): String {
        if (repository == LocoRepoGenerationConfig.MPS_IVY) {
            return """
                ivy {
                    url "https://download.jetbrains.com/mps/${dollar}mpsMajor/"
                    layout 'pattern', {
                        artifact "[module]-[revision].[ext]"
                    }
                    metadataSources { // skip downloading ivy.xml
                        artifact()
                    }
                }
            """
        }
        return super.repositoryAsString(repository)
    }

    override fun writeConfigurations(writer: IndentingWriter, configurations: GradleConfigurationContainer) {
        if (isLang) {
            writer.block("allprojects") {
                writer.block("repositories") {
                    writer.println("mavenCentral()")
                }
                writer.block("pluginManager.withPlugin(\"java\")") {
                    writer.block("extensions.configure<JavaPluginExtension>") {
                        writer.println("sourceCompatibility = JavaVersion.VERSION_11")
                        writer.println("targetCompatibility = JavaVersion.VERSION_11")
                    }
                }
            }
            writer.block("subprojects") {
                writer.block("pluginManager.withPlugin(\"org.fbme.gradle.mps\")") {
                    writer.block("if (the<org.fbme.gradle.MpsExtension>().hasBuildSolution)") {
                        writer.println("buildBootstrap.get().inputs.dir(\"${'$'}projectDir/buildsolution/models\")")
                        writer.block("dependencies") {
                            writer.println("\"antBinaries\"(\"org.apache.ant:ant-junit:1.10.1\")")
                        }
                        writer.block("tasks.named(\"mpsPrepare\")") {
                            writer.println("dependsOn(buildBootstrap)")
                        }
                    }
                    writer.println("build.dependsOn(tasks.named(\"build\"))")
                }
            }
            writer.block("fun Task.antexec(path: String, vararg tasks: String)") {
                writer.block("doLast") {
                    writer.block("javaexec") {
                        writer.println("main = \"org.apache.tools.ant.launch.Launcher\"")
                        writer.println("classpath = ant_lib")
                        writer.println("args(\"-Dbasedir=${'$'}projectDir\", \"-buildfile\", file(path))")
                        writer.println("args(*tasks)")
                    }
                }
            }
        }
        super.writeConfigurations(writer, configurations)
    }

    override fun writeTasks(writer: IndentingWriter, tasks: GradleTaskContainer) {
        tasks.tasks.values
            .forEach { kotlinTask: KotlinGradleTask ->
                val gradleTask = GradleTask(kotlinTask)
                writer.println()
                writer.print("val ${gradleTask.name} by tasks.")
                if (kotlinTask.registering) {
                    writer.print("registering")
                } else {
                    writer.print("getting")
                }
                if (gradleTask.type?.isNotEmpty() == true) {
                    val shortName: String = ClassUtils.getShortName(gradleTask.type!!)
                    writer.print("($shortName::class)")
                }
                writer.println(" {")
                writer.indented {
                    if (kotlinTask.dependencies.isNotEmpty()) {
                        writer.println("dependsOn(${kotlinTask.dependencies.joinToString(", ") { it }})")
                    }
                    writeTaskCustomization(writer, gradleTask)
                }
                writer.println("}")
            }
    }

    override fun writePlugins(writer: IndentingWriter, build: GradleBuild) {
        writeNestedCollection(
            writer, "plugins", build.plugins().values().toList(),
            { plugin: GradlePlugin ->
                if (plugin is StandardGradlePlugin) {
                    pluginAsString(plugin)
                } else {
                    plugin.id
                }
            }, null
        )
        writer.println()
        check(
            !build.plugins().values()
                .anyMatch { obj: GradlePlugin -> obj.isApply }) { "build.gradle.kts scripts shouldn't apply plugins. They should use the plugins block instead." }
    }
}

private fun KotlinDslGradleBuildWriter.pluginAsString(standardPlugin: StandardGradlePlugin): String =
    KotlinDslGradleBuildWriter::class.java
        .getDeclaredMethod("pluginAsString", StandardGradlePlugin::class.java).let {
            it.isAccessible = true
            return@let it.invoke(this, standardPlugin) as String
        }
