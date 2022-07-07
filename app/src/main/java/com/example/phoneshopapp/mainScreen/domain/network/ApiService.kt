package com.example.phoneshopapp.mainScreen.domain.network

import com.example.phoneshopapp.core.utils.Constants.BEST_SELLER_URL
import com.example.phoneshopapp.core.utils.Constants.HOT_SALES_URL
import com.example.phoneshopapp.mainScreen.data.model.ResponseModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(HOT_SALES_URL)
    suspend fun hotSales(): Response<ResponseModel>

    @GET(BEST_SELLER_URL)
    suspend fun bestSeller(): Response<ResponseModel>

}