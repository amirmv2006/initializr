package io.spring.initializr.generator.buildsystem.gradle

import io.spring.initializr.generator.io.IndentingWriter
import io.spring.initializr.locorepo.contributors.ProjectGenerationContext

class GradleMultiProjectSettingsWriter(private val context: ProjectGenerationContext): GroovyDslGradleSettingsWriter() {
    override fun writeTo(writer: IndentingWriter, build: GradleBuild) {
        writer.println("rootProject.name = " + wrapWithQuotes(build.settings.artifact))
        writer.println()
        writer.println("include 'code:buildscripts'")
        writer.println("include 'code:${context.projectDescription.artifactId}'")
    }
}
