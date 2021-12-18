package com.soonyong.hong.admin.batch.domain.user.service

import com.soonyong.hong.admin.batch.domain.user.model.RegisterUserCommand
import com.soonyong.hong.admin.batch.domain.user.model.Role
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.transaction.annotation.Transactional

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles(profiles = ["test"])
@Transactional
class UserServiceTest {

    @Autowired
    lateinit var userService: UserService

    @Test
    fun registerUserTest() {
        //given
        val password = "password"
        val name = "admin"
        val role = Role.ADMIN

        //when
        val user = userService.register(RegisterUserCommand(name = name, password = password, role = role))

        //then
        assertNotNull(user.id)
        assertEquals(name, user.name)
        assertNotEquals(password, user.password)
        assertEquals(role, user.role)

    }
}