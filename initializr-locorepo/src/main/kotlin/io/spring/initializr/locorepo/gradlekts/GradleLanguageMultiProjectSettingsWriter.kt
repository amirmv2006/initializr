package io.spring.initializr.locorepo.gradlekts

import io.spring.initializr.generator.buildsystem.gradle.GradleBuild
import io.spring.initializr.generator.buildsystem.gradle.KotlinDslGradleSettingsWriter
import io.spring.initializr.generator.io.IndentingWriter
import io.spring.initializr.locorepo.MpsProjectGenerationContext

class GradleLanguageMultiProjectSettingsWriter(private val context: MpsProjectGenerationContext) :
    KotlinDslGradleSettingsWriter() {
    override fun writeTo(writer: IndentingWriter, build: GradleBuild) {
        writer.println("rootProject.name = " + wrapWithQuotes(build.settings.artifact))
        writer.println()
        writer.println("include(")
        writer.indented {
            writer.println("\"code:buildscripts\",")
            writer.println("\"code:${context.projectDescription.artifactId}\"")
        }
        writer.println(")")
    }
}
