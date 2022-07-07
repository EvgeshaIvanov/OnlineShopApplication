package com.example.feature_cart_screen.domain.repository

import com.example.feature_cart_screen.data.model.ResponseCartModel

interface Repository {

    suspend fun getCartInfo(): ResponseCartModel
}