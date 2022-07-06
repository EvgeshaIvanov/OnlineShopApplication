package com.example.phoneshopapp.cartScreen.domain.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CartRetrofitInstance {

    private const val BASE_URL = " https://run.mocky.io/v3/"

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val api: CartApiService by lazy {
        retrofit.create(CartApiService::class.java)
    }
}