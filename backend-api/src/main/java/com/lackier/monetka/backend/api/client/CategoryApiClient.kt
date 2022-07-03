package com.lackier.monetka.backend.api.client

import com.lackier.monetka.backend.api.dto.CategoryDto
import org.springframework.data.domain.Page
import java.util.*

interface CategoryApiClient {
    fun getCategories(userId: UUID): Page<CategoryDto>
    fun getCategories(userId: UUID, pageNumber: Int): Page<CategoryDto>
    fun getCategory(id: UUID): CategoryDto
    fun createCategory(categoryDto: CategoryDto)
    fun editCategory(categoryDto: CategoryDto)
    fun deleteCategory(chatId: String, id: UUID)
}