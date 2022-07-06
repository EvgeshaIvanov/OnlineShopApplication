package com.example.phoneshopapp.productInfo.data

import com.example.phoneshopapp.productInfo.domain.repository.Repository
import com.example.phoneshopapp.productInfo.domain.network.RetrofitInstance

class RepositoryImpl : Repository {
    //TODO добавить обработку сети
    override suspend fun getPhoneInfo(): List<String> {
        return RetrofitInstance.api.getPhoneInfo().body()!!.images
    }

}