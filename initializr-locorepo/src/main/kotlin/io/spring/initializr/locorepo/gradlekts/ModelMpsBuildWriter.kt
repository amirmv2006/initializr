package io.spring.initializr.locorepo.gradlekts

import io.spring.initializr.generator.buildsystem.gradle.GradleBuild
import io.spring.initializr.generator.buildsystem.gradle.GradleTaskContainer
import io.spring.initializr.generator.io.IndentingWriter
import io.spring.initializr.locorepo.MpsProjectGenerationContext
import io.spring.initializr.locorepo.block

class ModelMpsBuildWriter(
    private val context: MpsProjectGenerationContext
) : BaseMpsBuildWriter() {

    override fun writeExtraProperties(writer: IndentingWriter, allProperties: MutableMap<String, String>) {
        writeCollection(
            writer, allProperties.entries,
            { e: Map.Entry<String, String> -> "val ${e.key} = ${e.value}" },
        ) {
            writer.println()
        }
    }

    override fun writeDependencies(writer: IndentingWriter, build: GradleBuild) {
        super.writeDependencies(writer, build)
        writer.println()
        writer.block("val genExt = extensions.getByType<de.itemis.mps.gradle.generate.GeneratePluginExtensions>().apply") {
            writer.println("projectLocation = projectDir")
            writer.println("mpsConfig = mps")
            writer.println("pluginLocation = pluginsDir")
            writer.println("plugins = mpsPlugins.dependencies.asSequence()")
            writer.indented {
                writer.println(".flatMap { mpsPlugins.files(it).asSequence() }")
                writer.println(".map { toPlugin(it) }")
                writer.println(".toList()")
            }

        }
    }

    override fun writeTasks(writer: IndentingWriter, tasks: GradleTaskContainer) {
        super.writeTasks(writer, tasks)

        writer.block("afterEvaluate") {
            writer.block("tasks.named(\"generate\")") {
                writer.println("dependsOn(copyMpsPluginsTask)")
            }
        }
    }
}
