package io.spring.initializr.locorepo.gradlekts

import io.spring.initializr.generator.buildsystem.gradle.GradleTask
import io.spring.initializr.generator.spring.build.BuildCustomizer

class MpsModelGradleTaskCustomizer : BuildCustomizer<MpsBuild> {
    override fun customize(build: MpsBuild) {
        build.tasks().addKotlinTask(
            "copyMpsPluginsTask",
            dependsOn = listOf("tasks.named(\"fakeBuildNumber\")"),
            register = true,
            registering = false,
            type = "org.gradle.api.tasks.Copy"
        ) { gtb: GradleTask.Builder ->
            gtb.invoke("into", "genExt.pluginLocation!!")
            gtb.nested("mpsPlugins.asFileTree.forEach") {
                it.invoke("from", "zipTree(it)")
            }
        }
    }
}
