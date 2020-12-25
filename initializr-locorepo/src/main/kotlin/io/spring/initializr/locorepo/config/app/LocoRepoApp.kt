package io.spring.initializr.locorepo.config.app

import com.fasterxml.jackson.databind.ObjectMapper
import io.spring.initializr.locorepo.config.LanguageGenerationConfig
import io.spring.initializr.locorepo.config.ModelGenerationConfig
import io.spring.initializr.locorepo.config.SharedGenerationConfig
import io.spring.initializr.metadata.InitializrMetadataBuilder
import io.spring.initializr.metadata.InitializrProperties
import io.spring.initializr.web.support.DefaultInitializrMetadataProvider
import io.spring.initializr.web.support.InitializrMetadataUpdateStrategy
import io.spring.initializr.web.support.SaganInitializrMetadataUpdateStrategy
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.context.properties.NestedConfigurationProperty
import org.springframework.boot.runApplication
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean

/**
 * put into 'app' sub-package to avoid auto-loading lang and model confiugrations.
 */
@SpringBootApplication
@EnableConfigurationProperties(CustomInitializrProperties::class)
class LocoRepoApp {
    @Bean
    fun customInitializrMetadataProvider(
        initializrProperties: InitializrProperties,
        customInitializrProperties: CustomInitializrProperties,
        initializrMetadataUpdateStrategy: InitializrMetadataUpdateStrategy
    ) =
        InitializrMetadataBuilder
            .fromInitializrProperties(initializrProperties)
            .withInitializrProperties(customInitializrProperties.initializr, true)
            .build()
            .let { DefaultInitializrMetadataProvider(it, initializrMetadataUpdateStrategy) }

    @Bean
    fun initializrMetadataUpdateStrategy(
        restTemplateBuilder: RestTemplateBuilder, objectMapper: ObjectMapper?
    ):
            SaganInitializrMetadataUpdateStrategy? =
        SaganInitializrMetadataUpdateStrategy(restTemplateBuilder.build(), objectMapper)

}

@ConfigurationProperties("loco.repo")
class CustomInitializrProperties {

    @NestedConfigurationProperty
    var initializr = InitializrProperties()
}

fun main(args: Array<String>) {
    runApplication<LocoRepoApp>(*args)
}
