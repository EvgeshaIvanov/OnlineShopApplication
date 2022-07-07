package com.example.feature_main_screen.domain.usecase

import com.example.feature_main_screen.domain.models.BestSellerModel
import com.example.feature_main_screen.domain.repository.Repository

class BestSellerUseCase(private val repository: Repository) {

    suspend fun execute(): List<BestSellerModel> {
        return repository.bestSellerPhones()
    }
}