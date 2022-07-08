package com.example.feature_cart_screen.data.network

import com.example.feature_cart_screen.data.model.ResponseCartModel
import com.example.phoneshopapp.utils.BaseDataSource
import com.example.phoneshopapp.utils.Result

class ApiHelper(private val apiService: ApiService) : BaseDataSource() {

    suspend fun getCartInfo(): Result<ResponseCartModel> {
        return apiCall { apiService.getCartInfo() }
    }

}