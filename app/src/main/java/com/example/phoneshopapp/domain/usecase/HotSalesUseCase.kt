package com.example.phoneshopapp.domain.usecase

import com.example.phoneshopapp.domain.models.HotSalesModel
import com.example.phoneshopapp.domain.models.ResponseModel
import com.example.phoneshopapp.domain.repository.PhonesRepository
import retrofit2.Response

class HotSalesUseCase(private val phonesRepository: PhonesRepository) {

    suspend fun execute(): List<HotSalesModel> {
        return phonesRepository.hotSalesPhones()
    }

}