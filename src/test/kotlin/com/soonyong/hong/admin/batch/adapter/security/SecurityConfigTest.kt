package com.soonyong.hong.admin.batch.adapter.security

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.web.reactive.server.WebTestClient

@SpringBootTest
@ActiveProfiles("test")
class SecurityConfigTest {

    @Autowired
    lateinit var applicationContext: ApplicationContext
    lateinit var webTestClient: WebTestClient

    @BeforeEach
    internal fun setUp() {
        this.webTestClient = WebTestClient.bindToApplicationContext(this.applicationContext).configureClient().build();
    }

    @Test
    fun name() {
        webTestClient.get().uri("/monitor/l7").exchange().expectStatus().isOk
    }

    @Test
    fun test() {
        webTestClient.get().uri("/monitor/up").exchange().expectStatus().is3xxRedirection
    }
}