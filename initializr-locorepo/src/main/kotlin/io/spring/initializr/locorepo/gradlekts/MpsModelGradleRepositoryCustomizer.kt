package io.spring.initializr.locorepo.gradlekts

import io.spring.initializr.generator.spring.build.BuildCustomizer
import io.spring.initializr.locorepo.config.SharedGenerationConfig

class MpsModelGradleRepositoryCustomizer: BuildCustomizer<MpsBuild> {
    override fun customize(build: MpsBuild) {
        build.projectRepositories.add(SharedGenerationConfig.MBEDDR_REPO)
        build.projectRepositories.add(SharedGenerationConfig.JCENTER_REPO)
    }
}
