package com.example.phoneshopapp.mainScreen.data.model

import com.example.phoneshopapp.mainScreen.domain.models.BestSellerModel
import com.example.phoneshopapp.mainScreen.domain.models.HotSalesModel
import com.google.gson.annotations.SerializedName

data class ResponseModel(
    @SerializedName("home_store")
    val homeStore: List<HotSalesModel>,
    @SerializedName("best_seller")
    val bestSeller: List<BestSellerModel>
)
