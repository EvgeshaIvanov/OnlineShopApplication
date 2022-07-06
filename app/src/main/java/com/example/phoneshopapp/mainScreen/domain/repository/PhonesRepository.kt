package com.example.phoneshopapp.mainScreen.domain.repository

import com.example.phoneshopapp.mainScreen.domain.models.BestSellerModel
import com.example.phoneshopapp.mainScreen.domain.models.HotSalesModel

interface PhonesRepository {

    suspend fun hotSalesPhones(): List<HotSalesModel>

    suspend fun bestSellerPhones(): List<BestSellerModel>

}