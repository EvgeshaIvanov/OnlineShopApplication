package com.example.phoneshopapp.data

import com.example.phoneshopapp.domain.models.BestSellerModel
import com.example.phoneshopapp.domain.models.HotSalesModel
import com.example.phoneshopapp.domain.models.ResponseModel
import com.example.phoneshopapp.domain.repository.PhonesRepository
import com.example.phoneshopapp.domain.network.RetrofitInstance
import retrofit2.Response

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