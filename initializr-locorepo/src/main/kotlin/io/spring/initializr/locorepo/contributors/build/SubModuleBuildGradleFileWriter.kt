package io.spring.initializr.locorepo.contributors.build

import io.spring.initializr.locorepo.contributors.LanguageGenerationContext
import java.nio.file.Path

fun Path.writeSubModuleBuildGradle(context: LanguageGenerationContext) {
    this.toFile().writeText("""
        
        plugins {
            mps
        }

    """.trimIndent())
}
