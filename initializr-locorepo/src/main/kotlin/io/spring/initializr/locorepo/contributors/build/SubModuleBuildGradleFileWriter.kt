package io.spring.initializr.locorepo.contributors.build

import io.spring.initializr.locorepo.contributors.ProjectGenerationContext
import java.nio.file.Path

fun Path.writeSubModuleBuildGradle(context: ProjectGenerationContext) {
    this.toFile().writeText("""
        
        plugins {
            id 'mps'
        }

    """.trimIndent())
}
