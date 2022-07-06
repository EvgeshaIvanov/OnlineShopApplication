package com.example.phoneshopapp.mainScreen.domain.models

import com.google.gson.annotations.SerializedName

data class ResponseModel(
    @SerializedName("home_store")
    val homeStore: List<HotSalesModel>,
    @SerializedName("best_seller")
    val bestSeller: List<BestSellerModel>
)
