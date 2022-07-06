package com.example.phoneshopapp.cartScreen.domain.repository

import com.example.phoneshopapp.cartScreen.domain.model.ResponseCartModel

interface CartRepository {

    suspend fun getCartInfo(): ResponseCartModel
}