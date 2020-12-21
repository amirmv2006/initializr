package io.spring.initializr.generator.spring.build.gradle

import io.spring.initializr.generator.buildsystem.MpsBuild
import io.spring.initializr.generator.buildsystem.gradle.KotlinDslGradleSettingsWriter
import io.spring.initializr.generator.buildsystem.gradle.MpsBuildWriter
import io.spring.initializr.generator.condition.ConditionalOnLanguage
import io.spring.initializr.locorepo.contributors.*
import io.spring.initializr.locorepo.language.MpsModel
import io.spring.initializr.locorepo.model.ModelGradleCustomizer
import org.springframework.beans.factory.InitializingBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.*

@Configuration
@ConditionalOnLanguage(MpsModel.ID)
class LocoRepoModelGenerationConfig {

    @Bean
    fun mpsBuildAdditions(build: MpsBuild): InitializingBean {
        return InitializingBean {
            build.plugins().apply("generate-models")
            build.configurations().add("mpsPlugin")
        }
    }

    @Bean
    fun modelGenerationContext(mpsProjectGenerationContext: MpsProjectGenerationContext): ModelGenerationContext {
        val modelModule = GeneratedMpsModule(
                id = UUID.randomUUID(),
                name = mpsProjectGenerationContext.projectQualifiedName(),
                moduleVersion = 0,
                models = listOf(GeneratedMpsModel(
                        id = UUID.randomUUID(),
                        name = mpsProjectGenerationContext.projectQualifiedName(),
                        modelVersion = 0
                ))
        )
        return ModelGenerationContext(mpsProjectGenerationContext, modelModule)
    }

    @Bean
    fun mpsBuildWriter(
            context: MpsProjectGenerationContext) =
            MpsBuildWriter(context, false)

    @Bean
    fun modelGradleCustomizer() =
            ModelGradleCustomizer()

    @Bean
    fun mpsModelDotMpsContributor(context: ModelGenerationContext) =
            MpsModelDotMpsContributor(context)

    @Bean
    fun modelFileContributor(context: ModelGenerationContext) =
            ModelFileContributor(context)

    @Bean
    fun kotlinDslGradleSettingsWriter(): KotlinDslGradleSettingsWriter =
        KotlinDslGradleSettingsWriter()
}
