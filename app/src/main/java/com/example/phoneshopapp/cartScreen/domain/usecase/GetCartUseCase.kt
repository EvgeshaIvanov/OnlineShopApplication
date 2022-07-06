package com.example.phoneshopapp.cartScreen.domain.usecase

import com.example.phoneshopapp.cartScreen.domain.model.ResponseCartModel
import com.example.phoneshopapp.cartScreen.domain.repository.CartRepository

class GetCartUseCase(private val repository: CartRepository) {

    suspend fun execute(): ResponseCartModel {
        return repository.getCartInfo()
    }

}