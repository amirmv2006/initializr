package io.spring.initializr.locorepo.gradlekts

import io.spring.initializr.generator.buildsystem.gradle.GradleTask
import io.spring.initializr.generator.buildsystem.gradle.GradleTaskContainer
import org.springframework.util.ClassUtils
import java.util.*
import java.util.function.Consumer

val GradleTaskContainer.tasks: MutableMap<String, KotlinGradleTaskBuilder>
    get() = javaClass.getDeclaredField("tasks").let {
        it.isAccessible = true
        return@let it.get(this) as MutableMap<String, KotlinGradleTaskBuilder>
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
    register: Boolean = false,
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
        val kotlinGradleTask = KotlinGradleTaskBuilder(taskName, type, register, registering, dependsOn)
        builderConsumer.accept(kotlinGradleTask)
        kotlinGradleTask
    }
}
