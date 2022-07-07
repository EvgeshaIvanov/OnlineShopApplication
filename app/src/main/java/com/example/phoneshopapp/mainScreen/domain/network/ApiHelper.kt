package com.example.phoneshopapp.mainScreen.domain.network

import com.example.phoneshopapp.core.utils.BaseDataSource
import com.example.phoneshopapp.core.utils.Result
import com.example.phoneshopapp.mainScreen.data.model.ResponseModel

class ApiHelper(private val apiService: ApiService) : BaseDataSource() {

    suspend fun getPhonesHotSales(): Result<ResponseModel> {
        return apiCall { apiService.hotSales() }
    }

    suspend fun getPhonesBestSeller(): Result<ResponseModel> {
        return apiCall { apiService.bestSeller() }
    }
}