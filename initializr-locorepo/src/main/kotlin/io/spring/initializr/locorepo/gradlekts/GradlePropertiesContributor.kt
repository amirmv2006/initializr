package io.spring.initializr.locorepo.gradlekts

import io.spring.initializr.generator.project.contributor.ProjectContributor
import io.spring.initializr.locorepo.MpsProjectGenerationContext
import java.nio.file.Path

class GradlePropertiesContributor(val context: MpsProjectGenerationContext) : ProjectContributor {
    override fun contribute(projectRoot: Path) {
        projectRoot.resolve("gradle.properties").writeGradleProperties(context)
    }
}
