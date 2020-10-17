package io.spring.initializr.locorepo.contributors

import io.spring.initializr.metadata.InitializrMetadata
import java.util.*

data class ProjectGenerationContext(
        val metadata: InitializrMetadata,
        val buildModule: MpsModule,
        val language: MpsModule
)

data class SolutionGenerationContext(
        val id: UUID,
        val name: String,
        val moduleVersion: Int
)

data class ModelGenerationContext(
        val id: UUID,
        val name: String
)

data class MpsModule(
        val id: UUID,
        val name: String,
        val moduleVersion: Int,
        val models: List<MpsModel> = mutableListOf()
)

data class MpsModel(val id: UUID, val name: String, val modelVersion: Int)
