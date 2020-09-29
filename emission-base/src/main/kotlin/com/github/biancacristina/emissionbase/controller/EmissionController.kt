package com.github.biancacristina.emissionbase.controller

import com.github.biancacristina.emissionbase.request.EmissionRequest
import com.github.biancacristina.emissionbase.service.EmissionService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/emissions")
class EmissionController(private val emissionService: EmissionService) {

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun save(@Valid @RequestBody request: EmissionRequest) {
        emissionService.save(request)
    }
}