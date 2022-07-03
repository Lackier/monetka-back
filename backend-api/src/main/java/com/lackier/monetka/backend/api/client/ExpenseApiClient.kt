package com.lackier.monetka.backend.api.client

import com.lackier.monetka.backend.api.dto.CategoryDto
import com.lackier.monetka.backend.api.dto.TransactionDto
import com.lackier.monetka.backend.api.dto.request.TransactionCreateRequest
import com.lackier.monetka.backend.api.dto.request.TransactionUpdateRequest
import org.springframework.data.domain.Page
import java.util.*

interface ExpenseApiClient {
    fun getTodayExpenses(userId: UUID): Page<TransactionDto>
    fun getTodayExpenses(userId: UUID, pageNumber: Int): Page<TransactionDto>
    fun getExpense(id: UUID): TransactionDto
    fun createExpense(expenseDto: TransactionCreateRequest)
    fun updateExpense(transactionUpdateRequest: TransactionUpdateRequest)
    fun deleteExpense(chatId: String, id: UUID)
    fun getExpenseCategories(chatId: String): List<CategoryDto>
}