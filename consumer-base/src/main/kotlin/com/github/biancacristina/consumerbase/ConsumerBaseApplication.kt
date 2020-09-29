package com.github.biancacristina.consumerbase

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class ConsumerBaseApplication

fun main(args: Array<String>) {
	runApplication<ConsumerBaseApplication>(*args)
}
