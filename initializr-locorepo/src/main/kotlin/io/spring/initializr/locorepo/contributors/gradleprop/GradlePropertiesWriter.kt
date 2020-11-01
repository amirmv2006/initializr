package io.spring.initializr.locorepo.contributors.gradleprop

import io.spring.initializr.locorepo.contributors.ProjectGenerationContext
import java.nio.file.Path

fun Path.writeGradleProperties(context: ProjectGenerationContext) {
    //language=Properties
    this.toFile().writeText("""
        repoUrl=http://YOUR_NEXUS_ADRESS/repository/maven-snapshots/
        repoUser=admin
        repoPassword=admin123
    """.trimIndent())
}
