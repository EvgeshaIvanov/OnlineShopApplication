package com.example.phoneshopapp.network

import com.example.phoneshopapp.model.ResponseModel
import retrofit2.Response

class Repository {

    suspend fun hotSales(): Response<ResponseModel> {
        return RetrofitInstance.api.hotSales()
    }


}