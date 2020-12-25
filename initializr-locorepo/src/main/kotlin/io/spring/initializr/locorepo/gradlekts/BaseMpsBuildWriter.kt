package io.spring.initializr.locorepo.gradlekts

import io.spring.initializr.generator.buildsystem.MavenRepository
import io.spring.initializr.generator.buildsystem.gradle.*
import io.spring.initializr.generator.io.IndentingWriter
import io.spring.initializr.locorepo.config.SharedGenerationConfig
import org.springframework.util.ClassUtils
import kotlin.streams.toList
import kotlin.text.Typography.dollar

open class BaseMpsBuildWriter : KotlinDslGradleBuildWriter() {

    override fun writeRepositories(writer: IndentingWriter?, build: GradleBuild?) {
        val projectRepos = (build as MpsBuild).projectRepositories.items().toList()
        writeNestedCollection(writer, "repositories", projectRepos) { repositoryAsString(it) }
    }

    override fun writeJavaSourceCompatibility(writer: IndentingWriter?, settings: GradleBuildSettings?) {
        // no need, done in another way
    }

    override fun repositoryAsString(repository: MavenRepository): String {
        if (repository == SharedGenerationConfig.MPS_IVY) {
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
        if (repository.url.isNullOrEmpty()) {
            return "${repository.id}()"
        }
        return super.repositoryAsString(repository)
    }

    override fun writeTasks(writer: IndentingWriter, tasks: GradleTaskContainer) {
        tasks.tasks.values
            .forEach { kotlinTaskBuilder: KotlinGradleTaskBuilder ->
                val gradleTask = kotlinTaskBuilder.build()
                writer.println()
                writer.print("val ${gradleTask.name} by tasks.")
                if (kotlinTaskBuilder.registering) {
                    writer.print("registering")
                } else if (kotlinTaskBuilder.register){
                    writer.print("register")
                } else {
                    writer.print("getting")
                }
                if (gradleTask.type?.isNotEmpty() == true) {
                    val shortName: String = ClassUtils.getShortName(gradleTask.type!!)
                    if (!kotlinTaskBuilder.register) {
                        writer.print("($shortName::class)")
                    } else {
                        writer.print("<$shortName>(\"${gradleTask.name}\")")
                    }
                }
                writer.println(" {")
                writer.indented {
                    if (kotlinTaskBuilder.dependencies.isNotEmpty()) {
                        writer.println("dependsOn(${kotlinTaskBuilder.dependencies.joinToString(", ") { it }})")
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
