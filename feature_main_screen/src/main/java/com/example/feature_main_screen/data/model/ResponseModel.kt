package com.example.feature_main_screen.data.model

import com.example.feature_main_screen.domain.models.BestSellerModel
import com.example.feature_main_screen.domain.models.HotSalesModel
import com.google.gson.annotations.SerializedName

data class ResponseModel(
    @SerializedName("home_store")
    val homeStore: List<HotSalesModel>,
    @SerializedName("best_seller")
    val bestSeller: List<BestSellerModel>
)
