package com.example.feature_main_screen.domain.network

import com.example.feature_main_screen.data.model.ResponseModel
import com.example.phoneshopapp.utils.BaseDataSource
import com.example.phoneshopapp.utils.Result

class ApiHelper(private val apiService: ApiService) : BaseDataSource() {

    suspend fun getPhonesHotSales(): Result<ResponseModel> {
        return apiCall { apiService.hotSales() }
    }

    suspend fun getPhonesBestSeller(): Result<ResponseModel> {
        return apiCall { apiService.bestSeller() }
    }
}