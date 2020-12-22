package io.spring.initializr.locorepo.gradlekts

import io.spring.initializr.generator.buildsystem.gradle.GradleTask

class KotlinGradleTaskBuilder(
    name: String,
    type: String?,
    val registering: Boolean = true,
    val dependencies: List<String> = listOf(),
) : GradleTask.Builder(name, type)
