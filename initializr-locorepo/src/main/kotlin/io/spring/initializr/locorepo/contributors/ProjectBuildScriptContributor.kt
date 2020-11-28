package io.spring.initializr.locorepo.contributors

import io.spring.initializr.generator.project.contributor.ProjectContributor
import io.spring.initializr.locorepo.contributors.build.writeBuildBootstrapXml
import io.spring.initializr.locorepo.contributors.build.writeBuildMps
import io.spring.initializr.locorepo.contributors.build.writeBuildMsd
import io.spring.initializr.locorepo.contributors.build.writeSubModuleBuildGradle
import io.spring.initializr.locorepo.contributors.dotmps.writeModulesXml
import io.spring.initializr.locorepo.contributors.dotmps.writeWorkspaceXml
import io.spring.initializr.locorepo.projectAsFile
import io.spring.initializr.locorepo.resolveMulti
import java.nio.file.Files
import java.nio.file.Path

class ProjectBuildScriptContributor(private val context: LanguageGenerationContext) : ProjectContributor {

    override fun contribute(projectRoot: Path) {
        val buildScrRoot = projectRoot.resolveMulti("code", "buildscripts")
        val buildSolutionPath = buildScrRoot
                .resolveMulti("solutions", context.buildModule.name)
        val modelsPath = buildSolutionPath.resolve("models")
        Files.createDirectories(modelsPath)
        val buildMsd = buildSolutionPath.projectAsFile(context.projectDescription, "build.msd")
        buildMsd.writeBuildMsd(context)
        val buildMps = modelsPath.projectAsFile(context.projectDescription, "build.mps")
        buildMps.writeBuildMps(context)
        val dotMpsDir = projectRoot.resolve(".mps")
        Files.createDirectories(dotMpsDir)
        dotMpsDir.resolve("modules.xml").writeModulesXml(context)
        dotMpsDir.resolve("workspace.xml").writeWorkspaceXml(context)
        buildScrRoot.resolve("build.gradle").writeSubModuleBuildGradle(context)
        projectRoot.resolve("build-bootstrap.xml").writeBuildBootstrapXml(context)
    }
}
