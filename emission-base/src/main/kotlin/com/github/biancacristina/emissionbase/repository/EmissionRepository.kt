package com.github.biancacristina.emissionbase.repository

import com.github.biancacristina.emissionbase.data.Emission
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmissionRepository: JpaRepository<Emission, Long>