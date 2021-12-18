package com.soonyong.hong.admin.batch.domain.user

import com.soonyong.hong.admin.batch.domain.user.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun findByName(name: String): User?
}