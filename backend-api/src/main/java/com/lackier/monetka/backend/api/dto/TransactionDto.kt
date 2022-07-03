package com.lackier.monetka.backend.api.dto

import java.time.ZonedDateTime
import java.util.*

data class TransactionDto(
    val id: UUID?,
    val name: String,
    val categoryDto: CategoryDto,
    var value: Double,
    val createdAt: ZonedDateTime
)
