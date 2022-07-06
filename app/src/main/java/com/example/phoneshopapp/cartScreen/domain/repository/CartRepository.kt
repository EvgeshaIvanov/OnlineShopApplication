package com.example.phoneshopapp.cartScreen.domain.repository

import com.example.phoneshopapp.cartScreen.domain.model.BasketModel
import com.example.phoneshopapp.cartScreen.domain.model.CartModel

interface CartRepository {

    suspend fun getCartInfo(): CartModel
}