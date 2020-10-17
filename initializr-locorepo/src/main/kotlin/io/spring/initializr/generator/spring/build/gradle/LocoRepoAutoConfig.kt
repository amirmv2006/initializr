/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.spring.initializr.generator.spring.build.gradle

import io.spring.initializr.generator.buildsystem.BuildItemResolver
import io.spring.initializr.generator.buildsystem.MavenRepository
import io.spring.initializr.generator.buildsystem.gradle.*
import io.spring.initializr.generator.condition.ConditionalOnBuildSystem
import io.spring.initializr.generator.io.IndentingWriterFactory
import io.spring.initializr.generator.spring.build.BuildCustomizer
import io.spring.initializr.generator.spring.util.LambdaSafe
import io.spring.initializr.generator.buildsystem.MpsBuild
import io.spring.initializr.generator.buildsystem.MpsBuildSystem
import io.spring.initializr.locorepo.contributors.MpsBuildStaticFileContributor
import io.spring.initializr.locorepo.contributors.ProjectBuildScriptContributor
import io.spring.initializr.metadata.InitializrMetadata
import org.springframework.beans.factory.ObjectProvider
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.OrderComparator
import kotlin.streams.toList

@Configuration
@ConditionalOnBuildSystem(MpsBuildSystem.ID)
class LocoRepoAutoConfig(private val indentingWriterFactory: IndentingWriterFactory) {
    private val mbeddrRepo = MavenRepository
            .withIdAndUrl("maven", "https://projects.itemis.de/nexus/content/repositories/mbeddr")
            .name("maven")
            .build()

    @Bean
    fun mpsBuild(buildItemResolver: ObjectProvider<BuildItemResolver>,
                 buildCustomizersMap: Map<String, BuildCustomizer<*>>): MpsBuild {
        val build = MpsBuild(buildItemResolver.ifAvailable!!)
        build.buildScriptRepositories.add(mbeddrRepo)
        build.buildScriptRepositories.add(MavenRepository.MAVEN_CENTRAL)
        build.projectRepositories.add(mbeddrRepo)
        build.projectRepositories.add(MPS_IVY)

        build.buildscript { it.dependency("de.itemis.mps:mps-gradle-plugin:1.2+") }
        build.buildscript { it.dependency("de.undercouch:gradle-download-task:4.0.4") }
        build.plugins().apply("de.undercouch.download")
        build.configurations().add("mps")
        build.configurations().add("ant_lib")
        val customizerList: List<BuildCustomizer<*>> = buildCustomizersMap.entries.stream()
                .filter { entry: Map.Entry<String, BuildCustomizer<*>> -> !BUILD_CUSTOMIZER_BLACK_LIST.contains(entry.key) }
                .map { obj: Map.Entry<String, BuildCustomizer<*>> -> obj.value }
                .sorted(OrderComparator.INSTANCE)
                .toList()
        LambdaSafe.callbacks(BuildCustomizer::class.java, customizerList, build)
                .invokeAnd { customizer: BuildCustomizer<*> -> customizer as BuildCustomizer<MpsBuild> }
                .forEach { customizer: BuildCustomizer<MpsBuild> -> customizer.customize(build) }
        return build
    }

    @Bean
    fun mpsBuildStaticFileContributor(): MpsBuildStaticFileContributor {
        return MpsBuildStaticFileContributor()
    }

    @Bean
    fun buildScriptContributor(metadata: InitializrMetadata): ProjectBuildScriptContributor {
        return ProjectBuildScriptContributor(metadata)
    }

    @Bean
    fun gradleBuildProjectContributor(buildWriter: GroovyDslGradleBuildWriter,
                                      build: MpsBuild): GradleBuildProjectContributor {
        return object : GradleBuildProjectContributor(buildWriter, build, indentingWriterFactory, "build.gradle") {}
    }

    @Bean
    fun mpsBuildWriter(): MpsBuildWriter {
        return MpsBuildWriter()
    }

    @Bean
    fun settingsGradleProjectContributor(build: MpsBuild): SettingsGradleProjectContributor {
        return SettingsGradleProjectContributor(build, indentingWriterFactory,
                GroovyDslGradleSettingsWriter(), "settings.gradle")
    }

    @Bean
    fun gradleAnnotationProcessorScopeBuildCustomizer(): GradleAnnotationProcessorScopeBuildCustomizer {
        return GradleAnnotationProcessorScopeBuildCustomizer()
    }

    @Bean
    fun mpsPropertiesGradleCustomizer(): MpsPropertiesGradleCustomizer {
        return MpsPropertiesGradleCustomizer()
    }

    companion object {
        private val BUILD_CUSTOMIZER_BLACK_LIST = listOf("junitJupiterTestStarterContributor",
                "defaultStarterContributor", "repositoriesBuilderCustomizer", "junit5TestStarterContributor")
        val MPS_IVY = MavenRepository.withIdAndUrl("mpsIvy", "URL").build()
    }
}
