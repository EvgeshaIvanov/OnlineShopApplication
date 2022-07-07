package com.example.feature_main_screen.data.repository

import com.example.feature_main_screen.domain.models.BestSellerModel
import com.example.feature_main_screen.domain.models.HotSalesModel
import com.example.feature_main_screen.domain.network.RetrofitInstance
import com.example.feature_main_screen.domain.repository.Repository

class RepositoryImpl : Repository {

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