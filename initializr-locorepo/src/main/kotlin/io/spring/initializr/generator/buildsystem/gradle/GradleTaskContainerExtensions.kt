package io.spring.initializr.generator.buildsystem.gradle

import org.springframework.util.ClassUtils
import java.util.*
import java.util.function.Consumer

val GradleTaskContainer.tasks: MutableMap<String, KotlinGradleTask>
    get() = javaClass.getDeclaredField("tasks").let {
        it.isAccessible = true
        return@let it.get(this) as MutableMap<String, KotlinGradleTask>
    }
val GradleTaskContainer.importedTypes: HashSet<String>
    get() = javaClass.getDeclaredField("importedTypes").let {
        it.isAccessible = true
        return@let it.get(this) as HashSet<String>
    }


fun GradleTaskContainer.addCustomTask(type: String, task: GradleTask, builderConsumer: Consumer<GradleTask.Builder>) {
    val packageName = ClassUtils.getPackageName(type)
    if (packageName.isNotEmpty()) {
        importedTypes.add(type)
    }
//    this.tasks.computeIfAbsent(task.name) { name: String ->
//        val builder = GradleTask.Builder(name, type)
//        builderConsumer.accept(builder)
//        builder
//    }
}

fun GradleTaskContainer.addKotlinTask(
    name: String,
    type: String? = null,
    registering: Boolean = true,
    dependsOn: List<String> = emptyList(),
    builderConsumer: Consumer<GradleTask.Builder>
) {
    if (type != null) {
        val packageName = ClassUtils.getPackageName(type)
        if (packageName.isNotEmpty()) {
            importedTypes.add(type)
        }
    }
    this.tasks.computeIfAbsent(name) { taskName: String ->
        val kotlinGradleTask = KotlinGradleTask(taskName, type, registering, dependsOn)
        builderConsumer.accept(kotlinGradleTask)
        kotlinGradleTask
    }
}
