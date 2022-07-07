package com.example.feature_cart_screen.data.repository

import com.example.feature_cart_screen.data.model.ResponseCartModel
import com.example.feature_cart_screen.domain.network.RetrofitInstance
import com.example.feature_cart_screen.domain.repository.Repository

class RepositoryImpl : Repository {

    override suspend fun getCartInfo(): ResponseCartModel {
        val response = RetrofitInstance.apiHelper.getCartInfo()
        if (response.failed) {
            return ResponseCartModel(0, emptyList(), "Error", 0)
        }
        if (!response.isSuccessful) {
            return ResponseCartModel(0, emptyList(), "Error", 0)
        }
        return response.body
    }
}