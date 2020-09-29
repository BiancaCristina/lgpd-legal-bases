package com.github.biancacristina.consumerbase.controller

import com.github.biancacristina.consumerbase.request.UserRequest
import com.github.biancacristina.consumerbase.service.ConsumerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/consumer")
class ConsumerController(private val consumerService: ConsumerService) {

    @PostMapping("/create-user")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun createUser(@Valid @RequestBody userRequest: UserRequest) {
        consumerService.createUser(userRequest)
    }
}