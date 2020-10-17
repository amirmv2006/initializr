package io.spring.initializr.generator.buildsystem.gradle

import org.springframework.util.ClassUtils
import java.util.*
import java.util.function.Consumer

val GradleTaskContainer.tasks: LinkedHashMap<String, GradleTask.Builder>
    get() = javaClass.getDeclaredField("tasks").let {
        it.isAccessible = true
        return@let it.get(this) as LinkedHashMap<String, GradleTask.Builder>
    }
val GradleTaskContainer.importedTypes: HashSet<String>
    get() = javaClass.getDeclaredField("importedTypes").let {
        it.isAccessible = true
        return@let it.get(this) as HashSet<String>
    }


fun GradleTaskContainer.addCustomTask(type: String, task: GradleTask, vararg invocations: String) {
    val packageName = ClassUtils.getPackageName(type)
    if (packageName.isNotEmpty()) {
        importedTypes.add(type)
    }
    this.tasks.computeIfAbsent(task.name) { name: String ->
        val builder = GradleTask.Builder(name, type)
        invocations.forEach { builder.invoke(it) }
        builder
    }
}

fun GradleTaskContainer.addCustomTask(type: String, task: GradleTask, builderConsumer: Consumer<GradleTask.Builder>) {
    val packageName = ClassUtils.getPackageName(type)
    if (packageName.isNotEmpty()) {
        importedTypes.add(type)
    }
    this.tasks.computeIfAbsent(task.name) { name: String ->
        val builder = GradleTask.Builder(name, type)
        builderConsumer.accept(builder)
        builder
    }
}
