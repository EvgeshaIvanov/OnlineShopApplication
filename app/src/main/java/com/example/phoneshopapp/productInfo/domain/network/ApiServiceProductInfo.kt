package com.example.phoneshopapp.productInfo.domain.network

import com.example.phoneshopapp.productInfo.domain.model.ProductModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiServiceProductInfo {

    @GET("6c14c560-15c6-4248-b9d2-b4508df7d4f5")
    suspend fun getPhoneInfo(): Response<ProductModel>

}