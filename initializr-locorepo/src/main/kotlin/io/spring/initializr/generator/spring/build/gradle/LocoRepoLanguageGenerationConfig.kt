package io.spring.initializr.generator.spring.build.gradle

import io.spring.initializr.generator.buildsystem.MpsBuild
import io.spring.initializr.generator.buildsystem.gradle.GradleLanguageMultiProjectSettingsWriter
import io.spring.initializr.generator.buildsystem.gradle.MpsBuildWriter
import io.spring.initializr.generator.buildsystem.gradle.MpsLanguageGradlePluginCustomizer
import io.spring.initializr.generator.buildsystem.gradle.MpsLanguageGradleTaskCustomizer
import io.spring.initializr.generator.condition.ConditionalOnLanguage
import io.spring.initializr.locorepo.contributors.*
import io.spring.initializr.locorepo.language.MpsLanguage
import org.springframework.beans.factory.InitializingBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.*

@Configuration
@ConditionalOnLanguage(MpsLanguage.ID)
class LocoRepoLanguageGenerationConfig {

    @Bean
    fun mpsBuildAdditions(build: MpsBuild): InitializingBean {
        return InitializingBean {
            build.configurations().add("ant_lib")
        }
    }

    @Bean
    fun mpsBuildWriter(
            context: MpsProjectGenerationContext): MpsBuildWriter {
        return MpsBuildWriter(context, true)
    }

    @Bean
    fun mpsBuildStaticFileContributor(): MpsBuildStaticFileContributor {
        return MpsBuildStaticFileContributor()
    }

    @Bean
    fun languageGenerationContext(
            mpsProjectGenerationContext: MpsProjectGenerationContext): LanguageGenerationContext {
        val description = mpsProjectGenerationContext.projectDescription
        val buildModuleName = "${description.packageName}.build"
                .replace('-', '_')
        val buildModule = GeneratedMpsModule(
                id = UUID.randomUUID(),
                name = buildModuleName,
                moduleVersion = 0,
                models = listOf(GeneratedMpsModel(
                        UUID.randomUUID(),
                        buildModuleName,
                        0
                ))
        )
        val languageName = "${description.packageName}.lang"
                .replace('-', '_')
        val languageModule = GeneratedLanguageModule(
                id = UUID.randomUUID(),
                name = languageName,
                moduleVersion = 0
        )
        return LanguageGenerationContext(mpsProjectGenerationContext, buildModule, languageModule)
    }

    @Bean
    fun buildScriptContributor(context: LanguageGenerationContext): ProjectBuildScriptContributor {
        return ProjectBuildScriptContributor(context)
    }

    @Bean
    fun languageContributor(context: LanguageGenerationContext): LanguageFileContributor {
        return LanguageFileContributor(context)
    }

//    @Bean
//    fun mpsPropertiesGradleCustomizer(): MpsPropertiesGradleCustomizer {
//        return MpsPropertiesGradleCustomizer()
//    }

    @Bean
    fun mpsLanguageBuildCustomizer(): MpsLanguageGradlePluginCustomizer =
        MpsLanguageGradlePluginCustomizer()

    @Bean
    fun mpsLanguageGradleTaskCustomizer(): MpsLanguageGradleTaskCustomizer =
        MpsLanguageGradleTaskCustomizer()

    @Bean
    fun gradleMultiProjectSettingsWriter(context: MpsProjectGenerationContext) : GradleLanguageMultiProjectSettingsWriter =
        GradleLanguageMultiProjectSettingsWriter(context)
}
