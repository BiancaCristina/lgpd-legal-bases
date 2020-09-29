package com.github.biancacristina.registerbase.controller

import com.github.biancacristina.registerbase.request.RegisterRequest
import com.github.biancacristina.registerbase.service.RegisterService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/registers")
class RegisterController(private val registerService: RegisterService) {

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun save(@Valid @RequestBody request: RegisterRequest) {
        registerService.save(request)
    }
}