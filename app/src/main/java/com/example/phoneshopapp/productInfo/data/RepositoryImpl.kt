package com.example.phoneshopapp.productInfo.data

import com.example.phoneshopapp.productInfo.domain.network.ProductInfoRetrofitInstance
import com.example.phoneshopapp.productInfo.domain.repository.Repository

class RepositoryImpl : Repository {

    override suspend fun getPhoneInfo(): List<String> {
        val response = ProductInfoRetrofitInstance.apiHelper.getCartInfo()
        if (response.failed) {
            return emptyList()
        }
        if (!response.isSuccessful) {
            return emptyList()
        }
        return response.body.images
    }

}