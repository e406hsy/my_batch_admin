package com.soonyong.hong.admin.batch.domain.user.model

data class RegisterUserCommand(
    val name: String, val password: String, val role: Role
)