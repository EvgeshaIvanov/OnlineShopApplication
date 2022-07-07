package com.example.phoneshopapp.cartScreen.data.repository

import com.example.phoneshopapp.cartScreen.data.model.ResponseCartModel
import com.example.phoneshopapp.cartScreen.domain.network.CartRetrofitInstance
import com.example.phoneshopapp.cartScreen.domain.repository.CartRepository

class CartRepositoryImpl : CartRepository {

    override suspend fun getCartInfo(): ResponseCartModel {
        val response = CartRetrofitInstance.apiHelper.getCartInfo()
        if (response.failed) {
            return ResponseCartModel(0, emptyList(), "Error", 0)
        }
        if (!response.isSuccessful) {
            return ResponseCartModel(0, emptyList(), "Error", 0)
        }
        return response.body
    }
}