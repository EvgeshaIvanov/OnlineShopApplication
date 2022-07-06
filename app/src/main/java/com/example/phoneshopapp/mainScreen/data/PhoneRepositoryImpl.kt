package com.example.phoneshopapp.mainScreen.data

import com.example.phoneshopapp.mainScreen.domain.models.BestSellerModel
import com.example.phoneshopapp.mainScreen.domain.models.HotSalesModel
import com.example.phoneshopapp.mainScreen.domain.repository.PhonesRepository
import com.example.phoneshopapp.mainScreen.domain.network.RetrofitInstance

class PhoneRepositoryImpl : PhonesRepository {

    override suspend fun hotSalesPhones(): List<HotSalesModel> {
        val response = RetrofitInstance.api.hotSales()
        if (response.isSuccessful) {
            return response.body()!!.homeStore
        }
        return emptyList()
    }

    override suspend fun bestSellerPhones(): List<BestSellerModel> {
        val response = RetrofitInstance.api.bestSeller()
        if (response.isSuccessful) {
            return response.body()!!.bestSeller
        }
        return emptyList()
    }
}