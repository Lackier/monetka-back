package com.lackier.monetka.backend.api.client

import com.lackier.monetka.backend.api.dto.CategoryDto
import com.lackier.monetka.backend.api.dto.TransactionDto
import com.lackier.monetka.backend.api.dto.request.TransactionCreateRequest
import com.lackier.monetka.backend.api.dto.request.TransactionUpdateRequest
import org.springframework.data.domain.Page
import java.util.*

interface IncomeApiClient {
    fun getTodayIncomes(userId: UUID): Page<TransactionDto>
    fun getTodayIncomes(userId: UUID, pageNumber: Int): Page<TransactionDto>
    fun getIncome(id: UUID): TransactionDto
    fun createIncome(incomeRequest: TransactionCreateRequest)
    fun updateIncome(transactionUpdateRequest: TransactionUpdateRequest)
    fun deleteIncome(chatId: String, id: UUID)
    fun getIncomeCategories(chatId: String): List<CategoryDto>
}