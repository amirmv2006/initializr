package io.spring.initializr.locorepo.gradlekts

import io.spring.initializr.locorepo.ModelGenerationContext
import java.nio.file.Path

fun Path.writeModelBuildGradleKts(context: ModelGenerationContext) {
    this.toFile().writeText("""
        plugins {
            `kotlin-dsl`
            `java-gradle-plugin`
        }

        repositories {
            maven(url = "https://projects.itemis.de/nexus/content/repositories/mbeddr")
            jcenter()
        }

        dependencies {
            implementation("generate-models:generate-models.gradle.plugin:1.4+")
        }
    """.trimIndent())
}
