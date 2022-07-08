package com.example.feature_cart_screen.domain.repository

import com.example.feature_cart_screen.domain.model.BasketMainModel

interface Repository {

    suspend fun getCartInfo(): BasketMainModel

}