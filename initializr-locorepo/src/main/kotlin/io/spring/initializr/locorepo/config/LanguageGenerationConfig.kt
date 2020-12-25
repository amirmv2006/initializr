package io.spring.initializr.locorepo.config

import io.spring.initializr.generator.condition.ConditionalOnLanguage
import io.spring.initializr.locorepo.*
import io.spring.initializr.locorepo.buildscripts.ProjectBuildScriptContributor
import io.spring.initializr.locorepo.gradlekts.*
import io.spring.initializr.locorepo.language.LanguageFileContributor
import io.spring.initializr.locorepo.language.MpsLanguage
import org.springframework.beans.factory.InitializingBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.*

@Configuration
@ConditionalOnLanguage(MpsLanguage.ID)
class LanguageGenerationConfig {

    @Bean
    fun mpsBuildAdditions(build: MpsBuild): InitializingBean {
        return InitializingBean {
            build.configurations().add("ant_lib")
        }
    }

    @Bean
    fun mpsBuildWriter(
        context: MpsProjectGenerationContext
    ): LanguageMpsBuildWriter =
        LanguageMpsBuildWriter(context)

    @Bean
    fun mpsBuildStaticFileContributor(): MpsBuildStaticFileContributor {
        return MpsBuildStaticFileContributor()
    }

    @Bean
    fun languageGenerationContext(
        mpsProjectGenerationContext: MpsProjectGenerationContext
    ): LanguageGenerationContext {
        val description = mpsProjectGenerationContext.projectDescription
        val buildModuleName = "${description.packageName}.build"
            .replace('-', '_')
        val buildModule = GeneratedMpsModule(
            id = UUID.randomUUID(),
            name = buildModuleName,
            moduleVersion = 0,
            models = listOf(
                GeneratedMpsModel(
                    UUID.randomUUID(),
                    buildModuleName,
                    0
                )
            )
        )
        val languageName = "${description.packageName}.lang"
            .replace('-', '_')
        val languageModule = GeneratedLanguageModule(
            id = UUID.randomUUID(),
            name = languageName,
            moduleVersion = 0
        )
        val langBuildModule = GeneratedMpsModule(
            id = UUID.randomUUID(),
            name = "${languageName}.build",
            moduleVersion = 0,
            models = listOf(
                GeneratedMpsModel(
                    id = UUID.randomUUID(),
                    name = "${languageName}.build",
                    modelVersion = 0
                )
            )
        )
        return LanguageGenerationContext(mpsProjectGenerationContext, buildModule, languageModule, langBuildModule)
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
    fun gradleMultiProjectSettingsWriter(context: MpsProjectGenerationContext): GradleLanguageMultiProjectSettingsWriter =
        GradleLanguageMultiProjectSettingsWriter(context)

    @Bean
    fun mpsLanguageBuildSrcFileContributor(
        context: LanguageGenerationContext
    ): MpsLanguageBuildSrcFileContributor = MpsLanguageBuildSrcFileContributor(context)
}
