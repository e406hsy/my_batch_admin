package com.soonyong.hong.admin.batch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyBatchAdminApplication

fun main(args: Array<String>) {
	runApplication<MyBatchAdminApplication>(*args)
}
