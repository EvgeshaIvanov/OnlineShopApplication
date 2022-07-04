package com.example.phoneshopapp.domain.usecase

import com.example.phoneshopapp.domain.models.BestSellerModel
import com.example.phoneshopapp.domain.repository.PhonesRepository

class BestSellerUseCase(private val phonesRepository: PhonesRepository) {

    suspend fun execute(): List<BestSellerModel> {
        return phonesRepository.bestSellerPhones()
    }
}