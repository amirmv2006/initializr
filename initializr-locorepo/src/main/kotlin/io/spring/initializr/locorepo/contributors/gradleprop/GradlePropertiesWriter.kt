package io.spring.initializr.locorepo.contributors.gradleprop

import io.spring.initializr.locorepo.contributors.MpsProjectGenerationContext
import java.nio.file.Path

fun Path.writeGradleProperties(context: MpsProjectGenerationContext) {
    //language=Properties
    this.toFile().writeText("""
        repoUrl=http://YOUR_NEXUS_ADRESS/repository/maven-snapshots/
        repoUser=admin
        repoPassword=admin123
    """.trimIndent())
}
