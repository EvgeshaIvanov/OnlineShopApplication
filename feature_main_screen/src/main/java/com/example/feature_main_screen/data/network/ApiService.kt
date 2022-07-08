package com.example.feature_main_screen.data.network

import com.example.feature_main_screen.data.model.ResponseModel
import com.example.phoneshopapp.utils.Constants.BEST_SELLER_URL
import com.example.phoneshopapp.utils.Constants.HOT_SALES_URL
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(HOT_SALES_URL)
    suspend fun hotSales(): Response<ResponseModel>

    @GET(BEST_SELLER_URL)
    suspend fun bestSeller(): Response<ResponseModel>

}