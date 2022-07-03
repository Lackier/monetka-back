package com.lackier.monetka.backend.api.dto.request

import java.util.*

data class TransactionCreateRequest(val chatId: String, val name: String, val categoryId: UUID, val value: Double)