package io.spring.initializr.locorepo.contributors

import io.spring.initializr.generator.project.contributor.ProjectContributor
import io.spring.initializr.locorepo.contributors.build.writeBuildMps
import io.spring.initializr.locorepo.contributors.build.writeBuildMsd
import io.spring.initializr.locorepo.contributors.dotmps.writeModulesXml
import io.spring.initializr.locorepo.contributors.dotmps.writeWorkspaceXml
import io.spring.initializr.locorepo.projectAsDir
import io.spring.initializr.locorepo.projectAsFile
import io.spring.initializr.locorepo.resolveMulti
import io.spring.initializr.metadata.InitializrMetadata
import java.nio.file.Files
import java.nio.file.Path
import java.util.*

class ProjectBuildScriptContributor(private val initializerMetaData: InitializrMetadata) : ProjectContributor {

    override fun contribute(projectRoot: Path) {
        val buildScrRoot = projectRoot.resolveMulti("code", "buildscripts")
        val buildModuleName = "${initializerMetaData.groupId.content}.${initializerMetaData.artifactId.content}.build"
        val buildSolutionPath = buildScrRoot
                .resolveMulti("solutions", buildModuleName)
        val modelsPath = buildSolutionPath.resolve("models")
        Files.createDirectories(modelsPath)
        val buildMsd = buildSolutionPath.projectAsFile(initializerMetaData, "build.msd")
        val buildModule = MpsModule(
                id = UUID.randomUUID(),
                name = buildModuleName,
                moduleVersion = 0,
                models = listOf(MpsModel(
                        UUID.randomUUID(),
                        buildModuleName,
                        0
                ))
        )
        val languageModule = MpsModule(
                id = UUID.randomUUID(),
                name = "${initializerMetaData.groupId.content}.${initializerMetaData.artifactId.content}.lang",
                moduleVersion = 0
        )
        val context = ProjectGenerationContext(initializerMetaData, buildModule, languageModule)
        buildMsd.writeBuildMsd(context)
        val buildMps = modelsPath.projectAsFile(initializerMetaData, "build.mps")
        val dotMpsDir = projectRoot.resolve(".mps")
        Files.createDirectories(dotMpsDir)
        buildMps.writeBuildMps(context)
        val dotMps = dotMpsDir.resolve("modules.xml")
        dotMps.writeModulesXml(context)
        val wsMps = dotMpsDir.resolve("workspace.xml")
        wsMps.writeWorkspaceXml(context)
    }
}
