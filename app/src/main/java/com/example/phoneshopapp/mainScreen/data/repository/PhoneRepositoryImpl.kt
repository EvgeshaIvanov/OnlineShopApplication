package com.example.phoneshopapp.mainScreen.data.repository

import com.example.phoneshopapp.mainScreen.domain.models.BestSellerModel
import com.example.phoneshopapp.mainScreen.domain.models.HotSalesModel
import com.example.phoneshopapp.mainScreen.domain.network.RetrofitInstance
import com.example.phoneshopapp.mainScreen.domain.repository.PhonesRepository

class PhoneRepositoryImpl : PhonesRepository {

    override suspend fun hotSalesPhones(): List<HotSalesModel> {
        val response = RetrofitInstance.apiHelper.getPhonesHotSales()
        if (response.failed) {
            return emptyList()
        }
        if (!response.isSuccessful) {
            return emptyList()
        }
        return response.body.homeStore

    }

    override suspend fun bestSellerPhones(): List<BestSellerModel> {
        val response = RetrofitInstance.apiHelper.getPhonesBestSeller()
        if (response.failed) {
            return emptyList()
        }
        if (!response.isSuccessful) {
            return emptyList()
        }
        return response.body.bestSeller
    }
}