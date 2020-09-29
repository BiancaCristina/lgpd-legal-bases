package com.github.biancacristina.consumerbase.service.api

import com.github.biancacristina.consumerbase.request.EmissionRequest
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody

@FeignClient(name = "emission", configuration = [])
interface EmissionApi {

    @PostMapping("/emissions")
    @ResponseBody
    fun save(@RequestBody request: EmissionRequest)
}