package com.lackier.monetka.backend.api.client

import com.lackier.monetka.backend.api.dto.CategoryDto
import com.lackier.monetka.backend.api.dto.TransactionDto
import org.springframework.data.domain.Page
import java.util.*

interface MonetkaApiClient {
    fun getCategories(userId: UUID): Page<CategoryDto>
    fun getCategories(userId: UUID, pageNumber: Int): Page<CategoryDto>
    fun getCategory(id: UUID): CategoryDto
    fun createCategory(categoryDto: CategoryDto)
    fun editCategory(categoryDto: CategoryDto)
    fun deleteCategory(chatId: String, id: UUID)
    fun getTodayExpenses(userId: UUID): Page<TransactionDto>
    fun getTodayExpenses(userId: UUID, pageNumber: Int): Page<TransactionDto>
    fun getTodayIncomes(userId: UUID): Page<TransactionDto>
    fun getTodayIncomes(userId: UUID, pageNumber: Int): Page<TransactionDto>
}
