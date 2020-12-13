package io.spring.initializr.generator.buildsystem.gradle

import io.spring.initializr.generator.buildsystem.MpsBuild
import io.spring.initializr.generator.spring.build.BuildCustomizer

class MpsLanguageGradleTaskCustomizer: BuildCustomizer<MpsBuild> {
    override fun customize(build: MpsBuild) {
        build.tasks().addKotlinTask("buildBootstrap", dependsOn = listOf("mps")) {
            it.invoke("inputs.dir", "\"buildscripts/models\"")
            it.invoke("inputs.file", "\"build-bootstrap.xml\"")
            it.invoke("outputs.dir", "\"buildscripts/source_gen\"")
            it.invoke("antexec", "\"build-bootstrap.xml\"", "\"generate\"")
        }

        build.tasks().addKotlinTask("build", dependsOn = listOf("buildBootstrap"), registering = false) {}

        build.tasks().addKotlinTask("buildRcp", dependsOn = listOf("build")) {
            it.invoke("antexec", "\"build/build-rcp.xml\"")
        }

        build.tasks().addKotlinTask("copyStartupScripts", dependsOn = listOf("buildBootstrap"), type = "org.gradle.api.tasks.Copy") {
            it.invoke("from", "\"buildscripts/source_gen/org/fbme/ide/build\"")
            it.invoke("include", "\"*.bat\"")
            it.invoke("include", "\"*.sh\"")
            it.invoke("include", "\"*.vmoptions\"")
            it.invoke("include", "\"Info.plist.xml\"")
            it.invoke("into", "\"build/startup\"")
        }

        build.tasks().addKotlinTask("buildRcpDistrib", dependsOn = listOf("buildRcp", "copyStartupScripts")) {
            it.invoke("antexec", "\"build/build-rcpdistrib.xml\"")
        }

        build.tasks().addKotlinTask("clean", registering = false) {
            it.invoke("antexec", "\"build-bootstrap.xml\"", "\"clean\"", "\"cleanSources\"")
        }
    }
}
