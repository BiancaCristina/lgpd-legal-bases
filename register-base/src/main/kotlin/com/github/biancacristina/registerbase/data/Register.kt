package com.github.biancacristina.registerbase.data

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Register (@Id @GeneratedValue(strategy = GenerationType.AUTO)
                     val id: Long? = null,

                     val name: String,
                     val username: String,
                     val password: String)