package io.spring.initializr.locorepo.buildscripts

import io.spring.initializr.generator.project.contributor.ProjectContributor
import io.spring.initializr.locorepo.LanguageGenerationContext
import io.spring.initializr.locorepo.dotmps.writeModulesXml
import io.spring.initializr.locorepo.projectAsFile
import java.nio.file.Files
import java.nio.file.Path

class ProjectBuildScriptContributor(private val context: LanguageGenerationContext) : ProjectContributor {

    override fun contribute(projectRoot: Path) {
        val buildScriptsDir = projectRoot.resolve("buildscripts")
        val modelsDir = buildScriptsDir.resolve("models")
        Files.createDirectories(modelsDir)
        val buildMsd = buildScriptsDir.projectAsFile(context.projectDescription, "build.msd")
        buildMsd.writeBuildMsd(context)
        val buildMps = modelsDir.projectAsFile(context.projectDescription, "build.mps")
        buildMps.writeBuildMps(context)
        val dotMpsDir = projectRoot.resolve(".mps")
        Files.createDirectories(dotMpsDir)
        dotMpsDir.resolve("modules.xml").writeModulesXml(context)
        projectRoot.resolve("build-bootstrap.xml").writeBuildBootstrapXml(context)
    }
}
