package io.spring.initializr.locorepo.language

import io.spring.initializr.generator.project.contributor.ProjectContributor
import io.spring.initializr.locorepo.LanguageGenerationContext
import io.spring.initializr.locorepo.gradlekts.writeSubModuleBuildGradle
import io.spring.initializr.locorepo.resolveMulti
import java.nio.file.Files
import java.nio.file.Path

class LanguageFileContributor(
        private val context: LanguageGenerationContext
): ProjectContributor {

    override fun contribute(projectRoot: Path) {
        val langScrRoot = projectRoot.resolveMulti("code", context.projectDescription.artifactId)
        val langProjRoot = langScrRoot.resolveMulti("languages", context.language.name)
        Files.createDirectories(langProjRoot)
        langProjRoot.resolve("${context.language.name}.mpl").writeLanguageModule(context)
        val models = langProjRoot.resolve("models")
        Files.createDirectories(models)
        models.resolve("${context.language.structureModel.name}.mps").writeStructureMps(context)
        models.resolve("${context.language.editorModel.name}.mps").writeEditorMps(context)
        models.resolve("${context.language.constraintsModel.name}.mps").writeConstraintsMps(context)
        models.resolve("${context.language.behaviorModel.name}.mps").writeBehaviorMps(context)
        models.resolve("${context.language.typesystemModel.name}.mps").writeTypeSystemMps(context)
        val generatorTemplates = langProjRoot.resolveMulti("generator", "templates")
        Files.createDirectories(generatorTemplates)
        generatorTemplates.resolve("main@generator.mps").writeGeneratorMps(context)
        langScrRoot.resolve("build.gradle.kts").writeSubModuleBuildGradle(context)
        val buildSolutionDir = langScrRoot.resolve("buildsolution")
        Files.createDirectories(buildSolutionDir)
        buildSolutionDir.resolve("${context.langBuildModule.name}.msd").writeLanguageBuildModule(context)
        val buildSolutionModelsDir = buildSolutionDir.resolve("models")
        Files.createDirectories(buildSolutionModelsDir)
        buildSolutionModelsDir.resolve("${context.langBuildModule.models[0].name}.mps").writeLanguageBuildModel(context)
    }
}
