package com.example.phoneshopapp.productInfo.domain.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ProductInfoRetrofitInstance {

    private const val BASE_URL = " https://run.mocky.io/v3/"

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val api: ApiServiceProductInfo by lazy {
        retrofit.create(ApiServiceProductInfo::class.java)
    }

    val apiHelper = ProductInfoApiHelper(api)
}