package com.example.phoneshopapp.mainScreen.domain.usecase

import com.example.phoneshopapp.mainScreen.domain.models.HotSalesModel
import com.example.phoneshopapp.mainScreen.domain.repository.PhonesRepository

class HotSalesUseCase(private val phonesRepository: PhonesRepository) {

    suspend fun execute(): List<HotSalesModel> {
        return phonesRepository.hotSalesPhones()
    }

}