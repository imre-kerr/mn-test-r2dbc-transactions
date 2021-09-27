package com.example

import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.r2dbc.annotation.R2dbcRepository
import io.micronaut.data.r2dbc.repository.ReactorCrudRepository

@R2dbcRepository(dialect = Dialect.H2)
interface HelloRepository : ReactorCrudRepository<Hello, Int>
