package com.github.biancacristina.registerbase.repository

import com.github.biancacristina.registerbase.data.Register
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RegisterRepository: JpaRepository<Register, Long>