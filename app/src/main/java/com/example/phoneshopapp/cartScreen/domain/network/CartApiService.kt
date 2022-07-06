package com.example.phoneshopapp.cartScreen.domain.network

import com.example.phoneshopapp.cartScreen.domain.model.ResponseCartModel
import retrofit2.Response
import retrofit2.http.GET

interface CartApiService {

    @GET("53539a72-3c5f-4f30-bbb1-6ca10d42c149")
    suspend fun getCartInfo(): Response<ResponseCartModel>
}