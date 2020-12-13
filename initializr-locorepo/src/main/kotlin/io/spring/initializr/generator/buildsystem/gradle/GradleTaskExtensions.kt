package io.spring.initializr.generator.buildsystem.gradle

class KotlinGradleTask(
    name: String,
    type: String?,
    val registering: Boolean = true,
    val dependencies: List<String> = listOf(),
) : GradleTask.Builder(name, type)
