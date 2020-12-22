package io.spring.initializr.locorepo.gradlekts

import io.spring.initializr.locorepo.MpsProjectGenerationContext
import java.nio.file.Path

fun Path.writeGradleProperties(context: MpsProjectGenerationContext) {
    //language=Properties
    this.toFile().writeText("""
        repoUrl=http://YOUR_NEXUS_ADRESS/repository/maven-snapshots/
        repoUser=admin
        repoPassword=admin123
    """.trimIndent())
}
