package com.github.biancacristina.emissionbase.data

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Emission (@Id @GeneratedValue(strategy = GenerationType.AUTO)
                     val id: Long? = null,
                     val cpf: String)