package io.spring.initializr.locorepo.config

import io.spring.initializr.generator.buildsystem.gradle.KotlinDslGradleSettingsWriter
import io.spring.initializr.generator.condition.ConditionalOnLanguage
import io.spring.initializr.locorepo.GeneratedMpsModel
import io.spring.initializr.locorepo.GeneratedMpsModule
import io.spring.initializr.locorepo.ModelGenerationContext
import io.spring.initializr.locorepo.MpsProjectGenerationContext
import io.spring.initializr.locorepo.dotmps.MpsModelDotMpsContributor
import io.spring.initializr.locorepo.gradlekts.*
import io.spring.initializr.locorepo.model.ModelFileContributor
import io.spring.initializr.locorepo.model.MpsModel
import org.springframework.beans.factory.InitializingBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.*

@Configuration
@ConditionalOnLanguage(MpsModel.ID)
class ModelGenerationConfig {

    @Bean
    fun mpsBuildAdditions(build: MpsBuild): InitializingBean {
        return InitializingBean {
            build.plugins().add("generate-models")
            build.configurations().add("mpsPlugins")
        }
    }

    @Bean
    fun modelGenerationContext(mpsProjectGenerationContext: MpsProjectGenerationContext): ModelGenerationContext {
        val modelModule = GeneratedMpsModule(
            id = UUID.randomUUID(),
            name = mpsProjectGenerationContext.projectQualifiedName(),
            moduleVersion = 0,
            models = listOf(
                GeneratedMpsModel(
                    id = UUID.randomUUID(),
                    name = mpsProjectGenerationContext.projectQualifiedName(),
                    modelVersion = 0
                )
            )
        )
        return ModelGenerationContext(mpsProjectGenerationContext, modelModule)
    }

    @Bean
    fun mpsBuildWriter(
        context: MpsProjectGenerationContext
    ) =
        ModelMpsBuildWriter(context)

    @Bean
    fun mpsModelDotMpsContributor(context: ModelGenerationContext) =
        MpsModelDotMpsContributor(context)

    @Bean
    fun modelFileContributor(context: ModelGenerationContext) =
        ModelFileContributor(context)

    @Bean
    fun kotlinDslGradleSettingsWriter(): KotlinDslGradleSettingsWriter =
        KotlinDslGradleSettingsWriter()

    @Bean
    fun mpsModelGradleTaskCustomizer(): MpsModelGradleTaskCustomizer =
        MpsModelGradleTaskCustomizer()

    @Bean
    fun mpsModelGradleRepositoryCustomizer(): MpsModelGradleRepoDepPropCustomizer =
        MpsModelGradleRepoDepPropCustomizer()

    @Bean
    fun mpsModelBuildSrcFileContributor(
        context: ModelGenerationContext
    ): MpsModelBuildSrcFileContributor = MpsModelBuildSrcFileContributor(context)
}
