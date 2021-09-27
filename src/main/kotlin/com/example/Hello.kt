package com.example

import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity

@MappedEntity
data class Hello(
        @field:Id
        val id: Int,
        val message: String
)
