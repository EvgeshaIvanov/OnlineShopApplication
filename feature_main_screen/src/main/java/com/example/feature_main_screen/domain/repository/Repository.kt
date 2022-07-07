package com.example.feature_main_screen.domain.repository

import com.example.feature_main_screen.domain.models.BestSellerModel
import com.example.feature_main_screen.domain.models.HotSalesModel

interface Repository {

    suspend fun hotSalesPhones(): List<HotSalesModel>

    suspend fun bestSellerPhones(): List<BestSellerModel>

}