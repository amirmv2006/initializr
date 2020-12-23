package io.spring.initializr.locorepo.gradlekts

import io.spring.initializr.generator.project.contributor.ProjectContributor
import io.spring.initializr.locorepo.ModelGenerationContext
import io.spring.initializr.locorepo.resolveMulti
import java.nio.file.Files
import java.nio.file.Path

class MpsModelBuildSrcFileContributor(
    private val context: ModelGenerationContext
) : ProjectContributor {

    override fun contribute(projectRoot: Path) {
        val buildSrcPath = projectRoot.resolve("buildSrc")
        Files.createDirectories(buildSrcPath)
        buildSrcPath.resolve("build.gradle.kts").writeModelBuildGradleKts(context)
        val kotlinSrcPath = buildSrcPath.resolveMulti("src", "main", "kotlin")
        Files.createDirectories(kotlinSrcPath)
        kotlinSrcPath.resolve("DSL.kt").writeModelDslKts(context)
    }
}
