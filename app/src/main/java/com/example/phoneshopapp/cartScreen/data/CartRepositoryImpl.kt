package com.example.phoneshopapp.cartScreen.data

import com.example.phoneshopapp.cartScreen.domain.model.ResponseCartModel
import com.example.phoneshopapp.cartScreen.domain.network.CartRetrofitInstance
import com.example.phoneshopapp.cartScreen.domain.repository.CartRepository

class CartRepositoryImpl : CartRepository {

    override suspend fun getCartInfo(): ResponseCartModel {
        return CartRetrofitInstance.api.getCartInfo().body()!!
    }
}