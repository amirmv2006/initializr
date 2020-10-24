package io.spring.initializr.locorepo.contributors

import io.spring.initializr.generator.project.contributor.ProjectContributor
import io.spring.initializr.locorepo.contributors.build.writeBuildMps
import io.spring.initializr.locorepo.contributors.build.writeBuildMsd
import io.spring.initializr.locorepo.contributors.build.writeSubModuleBuildGradle
import io.spring.initializr.locorepo.contributors.dotmps.writeModulesXml
import io.spring.initializr.locorepo.projectAsFile
import io.spring.initializr.locorepo.resolveMulti
import java.nio.file.Files
import java.nio.file.Path

class ProjectBuildScriptContributor(private val context: ProjectGenerationContext) : ProjectContributor {

    override fun contribute(projectRoot: Path) {
        val buildScrRoot = projectRoot.resolveMulti("code", "buildscripts")
        val buildSolutionPath = buildScrRoot
                .resolveMulti("solutions", context.buildModule.name)
        val modelsPath = buildSolutionPath.resolve("models")
        Files.createDirectories(modelsPath)
        val buildMsd = buildSolutionPath.projectAsFile(context.metadata, "build.msd")
        buildMsd.writeBuildMsd(context)
        val buildMps = modelsPath.projectAsFile(context.metadata, "build.mps")
        val dotMpsDir = projectRoot.resolve(".mps")
        Files.createDirectories(dotMpsDir)
        buildMps.writeBuildMps(context)
        val dotMps = dotMpsDir.resolve("modules.xml")
        dotMps.writeModulesXml(context)
        buildScrRoot.resolve("build.gradle").writeSubModuleBuildGradle(context)
    }
}
