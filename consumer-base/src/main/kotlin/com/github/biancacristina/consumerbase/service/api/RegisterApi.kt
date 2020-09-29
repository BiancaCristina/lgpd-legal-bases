package com.github.biancacristina.consumerbase.service.api

import com.github.biancacristina.consumerbase.request.RegisterRequest
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody

@FeignClient(name = "register")
interface RegisterApi {
    @PostMapping("/registers")
    @ResponseBody
    fun save(@RequestBody request: RegisterRequest)
}