package com.soonyong.hong.admin.batch.domain.user.model

import javax.persistence.*

@Table(name = "USER")
@Entity
class User(name: String, password: String, role: Role) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    var name: String = name
    var password: String = password

    @Enumerated(EnumType.STRING)
    var role: Role = role
}