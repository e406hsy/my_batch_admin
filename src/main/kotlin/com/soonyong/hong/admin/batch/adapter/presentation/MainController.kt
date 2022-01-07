package com.soonyong.hong.admin.batch.adapter.presentation

import com.soonyong.hong.admin.batch.domain.batch.job.repository.JobExecutionRepository
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import reactor.core.publisher.Mono

@Controller
class MainController(private val jobExecutionRepository: JobExecutionRepository) {
    @GetMapping("/")
    fun index(model: Model): Mono<String> {
        val pageable = PageRequest.of(1, 10, Sort.by(Sort.Direction.DESC, "jobExecutionId"))
        model.addAttribute("jobExecutions", jobExecutionRepository.findAll(pageable))
        return Mono.just("home")
    }
}