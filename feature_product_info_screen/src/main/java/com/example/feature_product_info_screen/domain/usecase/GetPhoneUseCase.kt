package com.example.feature_product_info_screen.domain.usecase

import com.example.feature_product_info_screen.domain.repository.Repository

class GetPhoneUseCase(private val repository: Repository) {

    suspend fun execute(): List<String> {
        return repository.getPhoneInfo()
    }

}