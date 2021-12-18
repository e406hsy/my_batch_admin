package com.soonyong.hong.admin.batch.domain.user.service

import com.soonyong.hong.admin.batch.domain.user.UserRepository
import com.soonyong.hong.admin.batch.domain.user.exception.UserNotFoundException
import com.soonyong.hong.admin.batch.domain.user.model.RegisterUserCommand
import com.soonyong.hong.admin.batch.domain.user.model.User
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository, private val passwordEncoder: PasswordEncoder) {
    fun getUser(username: String): User {
        userRepository.findByName(username)?.let { return it }
            ?: throw UserNotFoundException("failed to find user with name : $username")
    }

    fun register(registerUserCommand: RegisterUserCommand): User {
        return userRepository.save(
            User(
                name = registerUserCommand.name,
                password = passwordEncoder.encode(registerUserCommand.password),
                role = registerUserCommand.role
            )
        )
    }
}