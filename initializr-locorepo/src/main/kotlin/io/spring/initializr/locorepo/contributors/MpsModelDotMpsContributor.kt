package io.spring.initializr.locorepo.contributors

import io.spring.initializr.generator.project.contributor.ProjectContributor
import io.spring.initializr.locorepo.contributors.dotmps.writeModulesXml
import java.nio.file.Files
import java.nio.file.Path

class MpsModelDotMpsContributor(private val context: ModelGenerationContext): ProjectContributor {
    override fun contribute(projectRoot: Path) {
        val dotMpsDir = projectRoot.resolve(".mps")
        Files.createDirectories(dotMpsDir)
        dotMpsDir.resolve("modules.xml").writeModulesXml(context)
    }
}
