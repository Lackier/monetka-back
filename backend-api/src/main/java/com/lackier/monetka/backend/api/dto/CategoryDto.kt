package com.lackier.monetka.backend.api.dto

import com.lackier.monetka.backend.api.enums.CategoryTypeDto
import java.time.ZonedDateTime
import java.util.*

data class CategoryDto(var id: UUID?, val chatId: String, val name: String, val type: CategoryTypeDto, val createdAt: ZonedDateTime)
