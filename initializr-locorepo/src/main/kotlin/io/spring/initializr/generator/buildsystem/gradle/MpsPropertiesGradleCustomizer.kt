package io.spring.initializr.generator.buildsystem.gradle

import io.spring.initializr.generator.buildsystem.MpsBuild
import io.spring.initializr.generator.spring.build.BuildCustomizer
import kotlin.text.Typography.dollar

class MpsPropertiesGradleCustomizer : BuildCustomizer<MpsBuild> {

    override fun customize(build: MpsBuild) {
        addOSDownloadJBRTask(build, "OSX")
        addOSDownloadJBRTask(build, "Linux")
        addOSDownloadJBRTask(build, "Windows")
        addPrepareTask(build)
        addBuildBootstrapTask(build)
        addGenerateTask(build)
        addBuildPluginTask(build)
        addCopyStartupScriptsTask(build)
        addBuildIDETasks(build)
        addCleanTask(build)
    }

    private fun addCleanTask(build: MpsBuild) {
        val cleanTask = GradleTask.Builder("clean", DELETE_TYPE).build()
        build.tasks().addCustomTask(DELETE_TYPE, cleanTask) {
            it.invoke("delete", "'build'")
            it.invoke("delete", "'lib'")
            it.nested("delete fileTree('.').matching") { nested: GradleTask.Builder ->
                nested.invoke("include", "'**/source_gen/**'")
                nested.invoke("include", "'**/source_gen.caches/**'")
                nested.invoke("include", "'**/classes_gen/**'")
            }
        }
    }

    private fun addCopyStartupScriptsTask(build: MpsBuild) {
        val task = GradleTask.Builder("copyStartupScripts", COPY_TYPE)
                .build()
        task.dependsOn("buildBootstrap")
        build.tasks().addCustomTask(COPY_TYPE, task) {
            it.invoke("from", "'code/buildscripts/solutions/ir.amv.snippets.cats.ide.build/source_gen/ir/amv/snippets/cats/ide/build'")
            it.invoke("include", "'*.bat'")
            it.invoke("include", "'*.sh'")
            it.invoke("include", "'*.vmoptions'")
            it.invoke("include", "'Info.plist.xml'")
            it.invoke("into", "'build/startup'")
        }
    }

    private fun addBuildIDETasks(build: MpsBuild) {
        val buildRcpTask = GradleTask.Builder("\$buildRcp", BUILD_LANG_TYPE).build()
        buildRcpTask.dependsOn("buildPlugin")
        build.tasks().addCustomTask(BUILD_LANG_TYPE, buildRcpTask) {
            it.invoke("script", "'build/build-rcp.xml'")
        }
        val buildDistTask = GradleTask.Builder("buildRcp", RUN_ANT_TYPE).build()
        buildDistTask.dependsOn("\$buildRcp")
        buildDistTask.dependsOn("copyStartupScripts")
        build.tasks().addCustomTask(RUN_ANT_TYPE, buildDistTask) {
            it.invoke("script", "'build/build-rcpdistrib.xml'")
            it.invoke("targets", "'clean'", "'build'")
        }
        val buildDistJbr = GradleTask.Builder("buildRcpWithJBR", RUN_ANT_TYPE).build()
        buildDistJbr.dependsOn("\$buildRcp")
        buildDistJbr.dependsOn("copyStartupScripts")
        buildDistJbr.dependsOn("downloadOSXJBR")
        buildDistJbr.dependsOn("downloadLinuxJBR")
        buildDistJbr.dependsOn("downloadWindowsJBR")
        build.tasks().addCustomTask(RUN_ANT_TYPE, buildDistJbr) {
            it.invoke("script", "'build/build-rcpdistrib-jbr.xml'")
            it.invoke("targets", "'clean'", "'build'")
        }
    }

    private fun addBuildPluginTask(build: MpsBuild) {
        val task = GradleTask.Builder("buildPlugin", BUILD_LANG_TYPE)
                .build()
        task.dependsOn("buildBootstrap")
        build.tasks().addCustomTask(BUILD_LANG_TYPE, task) {
            it.invoke("script", "'build/build-plugin.xml'")
        }
    }

    private fun addGenerateTask(build: MpsBuild) {
        val task = GradleTask.Builder("generate", RUN_ANT_TYPE)
                .build()
        task.dependsOn("buildBootstrap")
        build.tasks().addCustomTask(RUN_ANT_TYPE, task) {
            it.invoke("script", "'build/build-plugin.xml'")
            it.invoke("targets", "'generate'")
        }
    }

    private fun addPrepareTask(build: MpsBuild) {
        val downloadDependencies = GradleTask.Builder("downloadDependencies", COPY_TYPE)
                .build()
        build.tasks().addCustomTask(COPY_TYPE, downloadDependencies){
            it.invoke("dependsOn", "configurations.mps")
            it.nested("configurations.mps.files.each") { nested: GradleTask.Builder ->
                nested.invoke("from", "zipTree(it)")
            }
            it.invoke("into", "'lib'")
        }

        val taskType = ""
        val task = GradleTask.Builder("prepare", taskType)
                .build()
        task.dependsOn("downloadDependencies")
        build.tasks().addCustomTask(taskType, task){}
    }

    private fun addBuildBootstrapTask(build: MpsBuild) {
        val task = GradleTask.Builder("buildBootstrap", BUILD_LANG_TYPE)
                .build()
        task.dependsOn("prepare")
        build.tasks().addCustomTask(BUILD_LANG_TYPE, task) {
            it.invoke("script", "'build-bootstrap.xml'")
        }
    }

    private fun addOSDownloadJBRZipTask(build: MpsBuild, os: String) {
        val task = GradleTask.Builder("download${os}JBRZip", DOWNLOAD_TYPE)
                .build()
        build.tasks().addCustomTask(DOWNLOAD_TYPE, task) {
            it.invoke("src", "\"https://jetbrains.bintray.com/intellij-jbr/jbrsdk-${dollar}jbrSdkVersion-${os.toLowerCase()}-x64-${dollar}{jbrBuild}.tar.gz\"")
            it.invoke("dest", "file('lib/jbr.${os.toLowerCase()}.tar.gz')")
            it.invoke("overwrite", "false")
        }
    }

    private fun addOSDownloadJBRTask(build: MpsBuild, os: String) {
        addOSDownloadJBRZipTask(build, os)
        val task = GradleTask.Builder("download${os}JBR", COPY_TYPE)
                .build()
        task.dependsOn("download${os}JBRZip")
        build.tasks().addCustomTask(COPY_TYPE, task) {
            it.invoke("from", "tarTree('lib/jbr.${os.toLowerCase()}.tar.gz')")
            it.invoke("into", "file('lib/jbr-${os.toLowerCase()}')")
        }
    }

    companion object {
        private const val BUILD_LANG_TYPE = "de.itemis.mps.gradle.BuildLanguages"
        private const val RUN_ANT_TYPE = "de.itemis.mps.gradle.RunAntScript"
        private const val COPY_TYPE = "Copy"
        private const val DELETE_TYPE = "Delete"
        private const val DOWNLOAD_TYPE = "Download"
    }
}

private fun GradleTask.dependsOn(s: String) {
    TODO("Not yet implemented")
}
