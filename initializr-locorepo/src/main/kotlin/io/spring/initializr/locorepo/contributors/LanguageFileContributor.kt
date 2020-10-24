package io.spring.initializr.locorepo.contributors

import io.spring.initializr.generator.project.contributor.ProjectContributor
import io.spring.initializr.locorepo.contributors.build.writeSubModuleBuildGradle
import io.spring.initializr.locorepo.contributors.lang.*
import io.spring.initializr.locorepo.resolveMulti
import java.nio.file.Files
import java.nio.file.Path

class LanguageFileContributor(
        private val context: ProjectGenerationContext): ProjectContributor {

    override fun contribute(projectRoot: Path) {
        val langScrRoot = projectRoot.resolveMulti("code", context.metadata.artifactId.content)
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
        langScrRoot.resolve("build.gradle").writeSubModuleBuildGradle(context)
    }
}
