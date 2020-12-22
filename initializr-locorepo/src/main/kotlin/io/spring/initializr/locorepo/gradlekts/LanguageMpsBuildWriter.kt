package io.spring.initializr.locorepo.gradlekts

import io.spring.initializr.generator.buildsystem.gradle.GradleBuild
import io.spring.initializr.generator.buildsystem.gradle.GradleConfigurationContainer
import io.spring.initializr.generator.io.IndentingWriter
import io.spring.initializr.locorepo.MpsProjectGenerationContext
import io.spring.initializr.locorepo.block

class LanguageMpsBuildWriter(
    private val context: MpsProjectGenerationContext
) : BaseMpsBuildWriter() {

    override fun writeDependencies(writer: IndentingWriter, build: GradleBuild) {
        writer.println()
        writer.println("dependencies" + " {")
        writer.indented {
            writer.println("mps(mpsDistribution())")
            writer.println("ant_lib(\"org.apache.ant:ant-junit:1.10.1\")")
        }
        writer.println("}")
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

    override fun writeConfigurations(writer: IndentingWriter, configurations: GradleConfigurationContainer) {
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
        super.writeConfigurations(writer, configurations)
    }

}
