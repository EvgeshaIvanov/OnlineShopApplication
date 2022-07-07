package com.example.phoneshopapp.productInfo.domain.network

import com.example.phoneshopapp.core.utils.Constants.PRODUCT_INFO_URL
import com.example.phoneshopapp.productInfo.domain.model.ProductModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiServiceProductInfo {

    @GET(PRODUCT_INFO_URL)
    suspend fun getPhoneInfo(): Response<ProductModel>

}