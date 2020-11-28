package io.spring.initializr.locorepo.contributors

import io.spring.initializr.generator.project.contributor.ProjectContributor
import io.spring.initializr.locorepo.contributors.gradleprop.writeGradleProperties
import java.nio.file.Path

class GradlePropertiesContributor(val context: MpsProjectGenerationContext) : ProjectContributor {
    override fun contribute(projectRoot: Path) {
        projectRoot.resolve("gradle.properties").writeGradleProperties(context)
    }
}
