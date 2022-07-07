package com.example.feature_product_info_screen.domain.network

import com.example.feature_product_info_screen.domain.model.ProductModel
import com.example.phoneshopapp.utils.BaseDataSource
import com.example.phoneshopapp.utils.Result

class ApiHelper(private val apiService: ApiService) : BaseDataSource() {

    suspend fun getCartInfo(): Result<ProductModel> {
        return apiCall { apiService.getPhoneInfo() }
    }

}