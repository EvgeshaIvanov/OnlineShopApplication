package com.example.phoneshopapp.productInfo.data

import com.example.phoneshopapp.productInfo.domain.network.RetrofitInstance
import com.example.phoneshopapp.productInfo.domain.repository.Repository

class RepositoryImpl : Repository {
    //TODO добавить обработку сети
    override suspend fun getPhoneInfo(): List<String> {
        return RetrofitInstance.api.getPhoneInfo().body()!!.images
    }

}