package com.example.phoneshopapp.domain.network

import com.example.phoneshopapp.domain.models.ResponseModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("654bd15e-b121-49ba-a588-960956b15175")
    suspend fun hotSales(): Response<ResponseModel>

    @GET("654bd15e-b121-49ba-a588-960956b15175")
    suspend fun bestSeller(): Response<ResponseModel>

}