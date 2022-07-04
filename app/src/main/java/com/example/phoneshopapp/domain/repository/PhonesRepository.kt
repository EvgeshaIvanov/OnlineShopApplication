package com.example.phoneshopapp.domain.repository

import com.example.phoneshopapp.domain.models.BestSellerModel
import com.example.phoneshopapp.domain.models.HotSalesModel
import com.example.phoneshopapp.domain.models.ResponseModel
import retrofit2.Response

interface PhonesRepository {

    suspend fun hotSalesPhones(): List<HotSalesModel>

    suspend fun bestSellerPhones(): List<BestSellerModel>

}