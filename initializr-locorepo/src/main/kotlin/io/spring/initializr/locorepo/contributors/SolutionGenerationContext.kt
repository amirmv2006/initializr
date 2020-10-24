package io.spring.initializr.locorepo.contributors

import io.spring.initializr.metadata.InitializrMetadata
import java.util.*

data class ProjectGenerationContext(
        val metadata: InitializrMetadata,
        val buildModule: MpsModule,
        val language: LanguageModule
)

data class MpsModule(
        val id: UUID,
        val name: String,
        val moduleVersion: Int,
        val models: List<MpsModel> = mutableListOf()
) {
    fun moduleReference() = "${id}(${name})"
}

data class LanguageModule(
        val id: UUID,
        val name: String,
        val moduleVersion: Int,
        val generator: MpsModule = MpsModule(UUID.randomUUID(), "${name}#01", moduleVersion),
        val behaviorModel: MpsModel = MpsModel(UUID.randomUUID(), "${name}.behavior", moduleVersion),
        val constraintsModel: MpsModel = MpsModel(UUID.randomUUID(), "${name}.constraints", moduleVersion),
        val editorModel: MpsModel = MpsModel(UUID.randomUUID(), "${name}.editor", moduleVersion),
        val structureModel: MpsModel = MpsModel(UUID.randomUUID(), "${name}.structure", moduleVersion),
        val typesystemModel: MpsModel = MpsModel(UUID.randomUUID(), "${name}.typesystem", moduleVersion)
) {
    fun moduleReference() = "${id}(${name})"
}

data class MpsModel(val id: UUID, val name: String, val modelVersion: Int) {
    fun modelReference() = "${id}(${name})"
}
