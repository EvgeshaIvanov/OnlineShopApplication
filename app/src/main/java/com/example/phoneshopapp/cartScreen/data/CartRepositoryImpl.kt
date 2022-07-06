package com.example.phoneshopapp.cartScreen.data

import com.example.phoneshopapp.cartScreen.domain.model.BasketModel
import com.example.phoneshopapp.cartScreen.domain.model.CartModel
import com.example.phoneshopapp.cartScreen.domain.network.CartRetrofitInstance
import com.example.phoneshopapp.cartScreen.domain.repository.CartRepository

class CartRepositoryImpl : CartRepository {

    override suspend fun getCartInfo(): CartModel {
        return CartRetrofitInstance.api.getCartInfo().body()!!
    }
}