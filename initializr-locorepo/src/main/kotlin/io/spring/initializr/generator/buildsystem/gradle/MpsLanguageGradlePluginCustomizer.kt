package io.spring.initializr.generator.buildsystem.gradle

import io.spring.initializr.generator.buildsystem.MpsBuild
import io.spring.initializr.generator.spring.build.BuildCustomizer

class MpsLanguageGradlePluginCustomizer : BuildCustomizer<MpsBuild> {
    override fun customize(build: MpsBuild) {
        build.plugins().apply {
            this.plugins["base"] = BasePlugin()
        }
        build.plugins().add("de.undercouch.download") { it.version = "4.1.1" }
    }
}

private val GradlePluginContainer.plugins: MutableMap<String, GradlePlugin>
    get() = GradlePluginContainer::class.java.getDeclaredField("plugins").let {
        it.isAccessible = true
        return@let it.get(this) as MutableMap<String, GradlePlugin>
    }

class BasePlugin: GradlePlugin("base", false)

