package io.spring.initializr.locorepo.config

import com.fasterxml.jackson.databind.ObjectMapper
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

@SpringBootApplication
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

    @Bean
    fun initializrMetadataUpdateStrategy(
            restTemplateBuilder: RestTemplateBuilder, objectMapper: ObjectMapper?):
            SaganInitializrMetadataUpdateStrategy? = SaganInitializrMetadataUpdateStrategy(restTemplateBuilder.build(), objectMapper)

//    @Bean
//    fun generate(): (Map<String, *>) -> String {
//        return {
//            println("it = $it")
//            it.toString()
//        }
//    }

    @Bean
    fun upper(): (String) -> String {
        return { it.toUpperCase() }
    }
}

@ConfigurationProperties("loco.repo")
class CustomInitializrProperties {

    @NestedConfigurationProperty
    var initializr = InitializrProperties()
}

fun main(args: Array<String>) {
    runApplication<LocoRepoConfiguration>(*args)
}
