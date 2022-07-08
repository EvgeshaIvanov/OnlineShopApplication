package com.example.feature_product_info_screen.data.repository

import com.example.feature_product_info_screen.data.network.RetrofitInstance
import com.example.feature_product_info_screen.domain.repository.Repository

class RepositoryImpl : Repository {

    override suspend fun getPhoneInfo(): List<String> {
        val response = RetrofitInstance.apiHelper.getCartInfo()
        if (response.failed) {
            return emptyList()
        }
        if (!response.isSuccessful) {
            return emptyList()
        }
        return response.body.mapToProductModel().images
    }

}