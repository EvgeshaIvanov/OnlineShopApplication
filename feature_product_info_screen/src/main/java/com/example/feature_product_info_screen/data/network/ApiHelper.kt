package com.example.feature_product_info_screen.data.network

import com.example.feature_product_info_screen.data.model.ResponseProductModel
import com.example.phoneshopapp.utils.BaseDataSource
import com.example.phoneshopapp.utils.Result

class ApiHelper(private val apiService: ApiService) : BaseDataSource() {

    suspend fun getCartInfo(): Result<ResponseProductModel> {
        return apiCall { apiService.getPhoneInfo() }
    }

}