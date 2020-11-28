package io.spring.initializr.locorepo.model

import io.spring.initializr.generator.buildsystem.MpsBuild
import io.spring.initializr.generator.spring.build.BuildCustomizer

class ModelGradleCustomizer: BuildCustomizer<MpsBuild> {
    override fun customize(build: MpsBuild) {
        build.tasks().customize("generate") {
            it.attribute("projectLocation", "projectDir")
            it.attribute("mpsConfig", "configurations.mps")
        }
    }
}
