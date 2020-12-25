package io.spring.initializr.locorepo.gradlekts

import io.spring.initializr.generator.buildsystem.gradle.GradleDependency
import io.spring.initializr.generator.spring.build.BuildCustomizer
import io.spring.initializr.generator.version.VersionReference
import io.spring.initializr.locorepo.config.SharedGenerationConfig

class MpsModelGradleRepoDepPropCustomizer: BuildCustomizer<MpsBuild> {
    override fun customize(build: MpsBuild) {
        build.projectRepositories.add(SharedGenerationConfig.MBEDDR_REPO)
        build.projectRepositories.add(SharedGenerationConfig.JCENTER_REPO)

        build.properties().property("mpsVersion", "\"2020.1.6\"")
        build.properties().property("mpsLocation", "File(buildDir, \"mps\")")
        build.properties().property("pluginsDir", "File(mpsLocation, \"plugins\")")


        val builder = object: GradleDependency.Builder("com.jetbrains", "mps"){}
        builder.configuration("mps")
        builder.version(VersionReference.ofValue("${'$'}mpsVersion"))
        build.dependencies().add("mpsZip", builder)
    }
}
