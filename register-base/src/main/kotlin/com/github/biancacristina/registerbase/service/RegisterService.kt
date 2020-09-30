package com.github.biancacristina.registerbase.service

import com.github.biancacristina.registerbase.data.Register
import com.github.biancacristina.registerbase.repository.RegisterRepository
import com.github.biancacristina.registerbase.request.RegisterRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.springframework.security.crypto.bcrypt.BCrypt

@Service
class RegisterService(private val registerRepository: RegisterRepository) {
    companion object {
        private const val SALT = 12
    }

    @Transactional
    fun save(request: RegisterRequest): Register {
        return registerRepository.save(Register(name = request.name,
                                                username = request.username,
                                                password = generateHashPassword(request.password),
                                                address = request.address,
                                                number = request.number,
                                                neighbourhood = request.neighbourhood,
                                                complement = request.complement,
                                                city = request.city,
                                                state = request.state,
                                                cep = request.cep))
    }

    private fun generateHashPassword(password: String) = BCrypt.hashpw(password, BCrypt.gensalt(SALT))
}