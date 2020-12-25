package io.spring.initializr.locorepo

import io.spring.initializr.generator.project.ProjectDescription
import java.util.*

data class MpsProjectGenerationContext(
        val projectDescription: ProjectDescription
) {
    fun projectQualifiedName() = "${projectDescription.groupId}.${projectDescription.artifactId}"
}

data class LanguageGenerationContext(
    val mpsProjectGenerationContext: MpsProjectGenerationContext,
    val buildModule: GeneratedMpsModule,
    val language: GeneratedLanguageModule,
    val langBuildModule: GeneratedMpsModule
) {

    val projectDescription = mpsProjectGenerationContext.projectDescription

    fun projectQualifiedName() = "${projectDescription.groupId}.${projectDescription.artifactId}"

    fun ideFileName() = projectDescription.artifactId

}

data class ModelGenerationContext(
    val mpsProjectGenerationContext: MpsProjectGenerationContext,
    val modelModule: GeneratedMpsModule
) {
    val projectDescription = mpsProjectGenerationContext.projectDescription
    fun projectQualifiedName() = "${projectDescription.groupId}.${projectDescription.artifactId}"
}

data class GeneratedMpsModule(
        val id: UUID,
        val name: String,
        val moduleVersion: Int,
        val models: List<GeneratedMpsModel> = mutableListOf()
) {
    fun moduleReference() = "${id}(${name})"
}

data class GeneratedLanguageModule(
    val id: UUID,
    val name: String,
    val moduleVersion: Int,
    val generator: GeneratedMpsModule = GeneratedMpsModule(UUID.randomUUID(), "${name}#01", moduleVersion),
    val behaviorModel: GeneratedMpsModel = GeneratedMpsModel(UUID.randomUUID(), "${name}.behavior", moduleVersion),
    val constraintsModel: GeneratedMpsModel = GeneratedMpsModel(UUID.randomUUID(), "${name}.constraints", moduleVersion),
    val editorModel: GeneratedMpsModel = GeneratedMpsModel(UUID.randomUUID(), "${name}.editor", moduleVersion),
    val structureModel: GeneratedMpsModel = GeneratedMpsModel(UUID.randomUUID(), "${name}.structure", moduleVersion),
    val typesystemModel: GeneratedMpsModel = GeneratedMpsModel(UUID.randomUUID(), "${name}.typesystem", moduleVersion)
) {
    fun moduleReference() = "${id}(${name})"
}

data class GeneratedMpsModel(val id: UUID, val name: String, val modelVersion: Int) {
    fun modelReference() = "r:${id}(${name})"
}
