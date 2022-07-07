package com.example.feature_main_screen.domain.usecase

import com.example.feature_main_screen.domain.models.HotSalesModel
import com.example.feature_main_screen.domain.repository.Repository

class HotSalesUseCase(private val repository: Repository) {

    suspend fun execute(): List<HotSalesModel> {
        return repository.hotSalesPhones()
    }

}