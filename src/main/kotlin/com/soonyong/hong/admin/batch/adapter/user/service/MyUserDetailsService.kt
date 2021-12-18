package com.soonyong.hong.admin.batch.adapter.user.service

import com.soonyong.hong.admin.batch.domain.user.exception.UserNotFoundException
import com.soonyong.hong.admin.batch.domain.user.service.UserService
import org.springframework.security.core.userdetails.ReactiveUserDetailsService
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class MyUserDetailsService(private val userService: UserService) : ReactiveUserDetailsService {

    override fun findByUsername(username: String?): Mono<UserDetails> {
        return try {
            username?.let { Mono.just(MyUserDetails(userService.getUser(username))) }
                ?: throw UsernameNotFoundException("username is null")
        } catch (e: UserNotFoundException) {
            throw UsernameNotFoundException("failed to find user with name: $username")
        }
    }
}