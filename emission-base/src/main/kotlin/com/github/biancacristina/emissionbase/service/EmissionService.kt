package com.github.biancacristina.emissionbase.service

import com.github.biancacristina.emissionbase.data.Emission
import com.github.biancacristina.emissionbase.repository.EmissionRepository
import com.github.biancacristina.emissionbase.request.EmissionRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class EmissionService(private val emissionRepository: EmissionRepository) {
    @Transactional
    fun save(request: EmissionRequest): Emission {
        return emissionRepository.save(Emission(cpf = request.cpf))
    }
}