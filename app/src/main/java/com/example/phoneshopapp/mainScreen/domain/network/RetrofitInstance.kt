package com.example.phoneshopapp.mainScreen.domain.network

import com.example.phoneshopapp.core.utils.Constants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {



    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    private val api: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
    val apiHelper = ApiHelper(api)
}