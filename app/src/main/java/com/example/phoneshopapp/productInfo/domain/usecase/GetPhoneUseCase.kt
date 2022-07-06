package com.example.phoneshopapp.productInfo.domain.usecase

import com.example.phoneshopapp.productInfo.domain.repository.Repository

class GetPhoneUseCase(private val repository: Repository) {

    suspend fun execute(): List<String> {
        return repository.getPhoneInfo()
    }

}