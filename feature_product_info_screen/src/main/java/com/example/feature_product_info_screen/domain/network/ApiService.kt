package com.example.feature_product_info_screen.domain.network

import com.example.feature_product_info_screen.domain.model.ProductModel
import com.example.phoneshopapp.utils.Constants.PRODUCT_INFO_URL
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(PRODUCT_INFO_URL)
    suspend fun getPhoneInfo(): Response<ProductModel>

}