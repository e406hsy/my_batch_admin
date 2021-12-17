package com.soonyong.hong.admin.batch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.reactive.config.EnableWebFlux

@SpringBootApplication
@EnableWebFlux
class MyBatchAdminApplication

fun main(args: Array<String>) {
    runApplication<MyBatchAdminApplication>(*args)
}
