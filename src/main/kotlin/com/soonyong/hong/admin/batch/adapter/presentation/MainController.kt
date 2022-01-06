package com.soonyong.hong.admin.batch.adapter.presentation

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import reactor.core.publisher.Mono

@Controller
class MainController {
    @GetMapping("/")
    fun index2(model: Model): Mono<String> {
        return Mono.just("home")
    }
}