package io.spring.initializr.generator.spring.build.gradle

import io.spring.initializr.generator.buildsystem.MpsBuild
import io.spring.initializr.generator.buildsystem.gradle.MpsBuildWriter
import io.spring.initializr.generator.condition.ConditionalOnLanguage
import io.spring.initializr.locorepo.contributors.MpsProjectGenerationContext
import io.spring.initializr.locorepo.language.MpsModel
import io.spring.initializr.locorepo.model.ModelGradleCustomizer
import org.springframework.beans.factory.InitializingBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@ConditionalOnLanguage(MpsModel.ID)
class LocoRepoModelGenerationConfig {

    @Bean
    fun mpsBuildAdditions(build: MpsBuild): InitializingBean {
        return InitializingBean {
            build.plugins().apply("generate-models")
        }
    }

    @Bean
    fun mpsBuildWriter(
            context: MpsProjectGenerationContext): MpsBuildWriter =
            MpsBuildWriter(context, false)

    @Bean
    fun modelGradleCustomizer(): ModelGradleCustomizer =
            ModelGradleCustomizer()
}
