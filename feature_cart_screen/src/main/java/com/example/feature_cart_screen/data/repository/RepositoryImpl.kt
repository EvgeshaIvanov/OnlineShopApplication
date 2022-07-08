package com.example.feature_cart_screen.data.repository

import com.example.feature_cart_screen.data.network.RetrofitInstance
import com.example.feature_cart_screen.domain.model.BasketMainModel
import com.example.feature_cart_screen.domain.repository.Repository

class RepositoryImpl : Repository {

    override suspend fun getCartInfo(): BasketMainModel {
        val response = RetrofitInstance.apiHelper.getCartInfo()
        if (response.failed) {
            return BasketMainModel(emptyList(), "Failed", 0)
        }
        if (!response.isSuccessful) {
            return BasketMainModel(emptyList(), "Error", 0)
        }
        return response.body.mapToBasketMainModel()
    }
}