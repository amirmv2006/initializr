package io.spring.initializr.locorepo.it

import io.spring.initializr.locorepo.config.LocoRepoConfiguration
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.web.client.TestRestTemplate

class LocoRepoAppIT {
    private val rest = TestRestTemplate()

    @Test
    internal fun testFunc() {
        LocalServerTestSupport.startServer(LocoRepoConfiguration::class.java).use { process ->
            val result: String = rest.postForObject("http://localhost:8080/", "Hello", String::class.java)
            Assertions.assertThat(result).isEqualTo("\"HELLO\"")
        }
    }
}
