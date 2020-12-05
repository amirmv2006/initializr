package io.spring.initializr.locorepo.contributors

import io.spring.initializr.generator.project.contributor.ProjectContributor
import io.spring.initializr.locorepo.contributors.model.writeModelModuleMsd
import io.spring.initializr.locorepo.contributors.model.writeModelMps
import io.spring.initializr.locorepo.resolveMulti
import java.nio.file.Files
import java.nio.file.Path

class ModelFileContributor(private val context: ModelGenerationContext): ProjectContributor {

    override fun contribute(projectRoot: Path) {
        val modelModulePath = projectRoot
                .resolveMulti("solutions", context.projectQualifiedName())
        Files.createDirectories(modelModulePath)
        modelModulePath.resolve("${context.projectQualifiedName()}.msd").writeModelModuleMsd(context)
        val modelsDir = modelModulePath
                .resolve("models")
        Files.createDirectories(modelsDir)
        modelsDir
                .resolve("${context.projectQualifiedName()}.mps")
                .writeModelMps(context)
    }
}
