package com.example

import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Test
import jakarta.inject.Inject

@MicronautTest
class HelloRepositoryTest {

    @Inject
    lateinit var repository: HelloRepository

    @Test
    fun testFirstInsert() {
        val hello = Hello(
                id = 1,
                message = "Hello world!"
        )
        repository.save(hello).block()
    }

    @Test
    fun testSecondInsert() {
        val hello = Hello(
                id = 1,
                message = "Goodbye world!"
        )
        repository.save(hello).block()
    }

}
