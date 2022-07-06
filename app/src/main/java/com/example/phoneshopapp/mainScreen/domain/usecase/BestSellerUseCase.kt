package com.example.phoneshopapp.mainScreen.domain.usecase

import com.example.phoneshopapp.mainScreen.domain.models.BestSellerModel
import com.example.phoneshopapp.mainScreen.domain.repository.PhonesRepository

class BestSellerUseCase(private val phonesRepository: PhonesRepository) {

    suspend fun execute(): List<BestSellerModel> {
        return phonesRepository.bestSellerPhones()
    }
}