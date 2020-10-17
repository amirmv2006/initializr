package io.spring.initializr.generator.buildsystem.gradle

val gradleTaskDependencies = mutableMapOf<String, MutableList<String>>()

var GradleTask.dependencies: MutableList<String>
    get() = gradleTaskDependencies.getOrElse(name) {mutableListOf()}
    set(value) {
        gradleTaskDependencies[name] = value
    }

fun GradleTask.dependsOn(task: String) {
    gradleTaskDependencies.computeIfAbsent(name){mutableListOf()}
    dependencies.add(task)
}

