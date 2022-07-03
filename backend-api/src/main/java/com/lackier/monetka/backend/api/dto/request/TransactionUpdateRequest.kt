package com.lackier.monetka.backend.api.dto.request

import java.util.*

data class TransactionUpdateRequest(
    val id: UUID,
    val chatId: String,
    val name: String,
    val categoryId: UUID,
    val value: Double
)