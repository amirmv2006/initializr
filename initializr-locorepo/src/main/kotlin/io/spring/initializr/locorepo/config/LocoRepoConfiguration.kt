package io.spring.initializr.locorepo.config

import io.spring.initializr.metadata.InitializrMetadataBuilder
import io.spring.initializr.metadata.InitializrProperties
import io.spring.initializr.web.support.DefaultInitializrMetadataProvider
import io.spring.initializr.web.support.InitializrMetadataUpdateStrategy
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.context.properties.NestedConfigurationProperty
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(CustomInitializrProperties::class)
class LocoRepoConfiguration {
    @Bean
    fun customInitializrMetadataProvider(
            initializrProperties: InitializrProperties,
            customInitializrProperties: CustomInitializrProperties,
            initializrMetadataUpdateStrategy: InitializrMetadataUpdateStrategy) =
            InitializrMetadataBuilder
                    .fromInitializrProperties(initializrProperties)
                    .withInitializrProperties(customInitializrProperties.initializr, true)
                    .build()
                    .let { DefaultInitializrMetadataProvider(it, initializrMetadataUpdateStrategy) }
}

@ConfigurationProperties("loco.repo")
class CustomInitializrProperties {

    @NestedConfigurationProperty
    var initializr = InitializrProperties()
}
