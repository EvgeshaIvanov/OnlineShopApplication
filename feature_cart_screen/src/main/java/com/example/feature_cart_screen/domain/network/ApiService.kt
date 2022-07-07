package com.example.feature_cart_screen.domain.network

import com.example.feature_cart_screen.data.model.ResponseCartModel
import com.example.phoneshopapp.utils.Constants.CART_URL
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(CART_URL)
    suspend fun getCartInfo(): Response<ResponseCartModel>
}