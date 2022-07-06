package com.example.phoneshopapp.cartScreen.domain.usecase

import com.example.phoneshopapp.cartScreen.domain.model.BasketModel
import com.example.phoneshopapp.cartScreen.domain.model.CartModel
import com.example.phoneshopapp.cartScreen.domain.repository.CartRepository

class GetCartUseCase(private val repository: CartRepository) {

    suspend fun execute(): CartModel {
    return repository.getCartInfo()
    }

}