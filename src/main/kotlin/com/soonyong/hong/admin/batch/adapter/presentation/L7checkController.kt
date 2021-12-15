package com.soonyong.hong.admin.batch.adapter.presentation

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/monitor")
class L7checkController {

    @GetMapping("/l7", produces = [MediaType.TEXT_PLAIN_VALUE])
    fun getStatus(): Boolean {
        return true
    }
}