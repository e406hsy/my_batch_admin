package com.soonyong.hong.admin.batch.adapter.exception

import mu.KotlinLogging
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import reactor.core.publisher.Mono

private val log = KotlinLogging.logger {}

@ControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler
    fun handleException(e: Exception): Mono<String> {
        log.error("error", e)
        return Mono.just("redirect:/oops.html")
    }
}