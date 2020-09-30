package com.github.biancacristina.consumerbase.service

import com.github.biancacristina.consumerbase.request.EmissionRequest
import com.github.biancacristina.consumerbase.request.RegisterRequest
import com.github.biancacristina.consumerbase.request.UserRequest
import com.github.biancacristina.consumerbase.service.api.EmissionApi
import com.github.biancacristina.consumerbase.service.api.RegisterApi
import org.springframework.stereotype.Service

@Service
class ConsumerService(private val emissionApi: EmissionApi,
                      private val registerApi: RegisterApi) {

    fun createUser(userRequest: UserRequest) {
        emissionApi.save(EmissionRequest(cpf = userRequest.cpf))
        registerApi.save(RegisterRequest(name = userRequest.name,
                                         password = userRequest.password,
                                         username = userRequest.username,
                                         address = userRequest.address,
                                         number = userRequest.number,
                                         neighbourhood = userRequest.neighbourhood,
                                         complement = userRequest.complement,
                                         city = userRequest.city,
                                         state = userRequest.state,
                                         cep = userRequest.cep))
    }
}