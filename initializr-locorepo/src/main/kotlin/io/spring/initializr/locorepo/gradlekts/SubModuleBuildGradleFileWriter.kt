package io.spring.initializr.locorepo.gradlekts

import io.spring.initializr.locorepo.LanguageGenerationContext
import java.nio.file.Path

fun Path.writeSubModuleBuildGradle(context: LanguageGenerationContext) {
    this.toFile().writeText("""
        
        plugins {
            mps
        }
        
        mps {
            artifactName = "${context.projectDescription.artifactId}"
            buildScriptName = "${context.projectDescription.artifactId}_Plugin"
        }

    """.trimIndent())
}
