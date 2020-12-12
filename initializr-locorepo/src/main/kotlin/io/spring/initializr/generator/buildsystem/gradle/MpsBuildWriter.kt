package io.spring.initializr.generator.buildsystem.gradle

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
        private val isLang: Boolean) : KotlinDslGradleBuildWriter() {

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

    private fun writePublishing(writer: IndentingWriter, build: GradleBuild) {
        writer.println("""
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
        """.trimIndent())
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
            writer.println("allprojects {")
            writer.indented {
                writer.println("repositories {")
                writer.indented { writer.println("mavenCentral()") }
                writer.println("}")
            }
            writer.indented {
                writer.println("pluginManager.withPlugin(\"java\") {")
                writer.indented {
                    writer.println("extensions.configure<JavaPluginExtension> {")
                    writer.indented {
                        writer.println("sourceCompatibility = JavaVersion.VERSION_11")
                        writer.println("targetCompatibility = JavaVersion.VERSION_11")
                    }
                    writer.println("}")
                }
                writer.println("}")
            }
            writer.println("}")
        }
        super.writeConfigurations(writer, configurations)
    }

    override fun writeTasks(writer: IndentingWriter, tasks: GradleTaskContainer) {
        tasks.values().filter { candidate: GradleTask -> candidate.type != null }.forEach { task: GradleTask ->
            writer.println()
            writer.print("task ${task.name} (")
            if (task.type.isNotEmpty()) {
                val shortName: String = ClassUtils.getShortName(task.type)
                writer.print("type: $shortName, ")
            }
            writer.print("dependsOn: ${task.dependencies}) {")
            writer.indented { writeTaskCustomization(writer, task) }
            writer.println("}")
            task.dependencies.clear()
        }
        tasks.values().filter { candidate: GradleTask -> candidate.type == null }.forEach { task: GradleTask ->
            writer.println()
            writer.println(task.name + " {")
            writer.indented { writeTaskCustomization(writer, task) }
            writer.println("}")
        }
    }

    override fun writePlugins(writer: IndentingWriter, build: GradleBuild) {
        writeNestedCollection(writer, "plugins", build.plugins().values().toList(),
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
