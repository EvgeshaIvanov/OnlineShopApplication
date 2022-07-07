package com.example.phoneshopapp.cartScreen.domain.network

import com.example.phoneshopapp.cartScreen.data.model.ResponseCartModel
import com.example.phoneshopapp.core.utils.Constants.CART_URL
import retrofit2.Response
import retrofit2.http.GET

interface CartApiService {

    @GET(CART_URL)
    suspend fun getCartInfo(): Response<ResponseCartModel>
}