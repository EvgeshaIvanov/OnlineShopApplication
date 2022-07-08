package com.example.feature_cart_screen.domain.usecase

import com.example.feature_cart_screen.domain.model.BasketMainModel
import com.example.feature_cart_screen.domain.repository.Repository

class GetCartUseCase(private val repository: Repository) {

    suspend fun execute(): BasketMainModel {
        return repository.getCartInfo()
    }

}