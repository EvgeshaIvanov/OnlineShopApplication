package com.example.phoneshopapp.model

import com.example.phoneshopapp.model.BestSellerModel
import com.example.phoneshopapp.model.HotSalesModel
import com.google.gson.annotations.SerializedName

data class ResponseModel(
    @SerializedName("home_store")
    val homeStore: List<HotSalesModel>,
    @SerializedName("best_seller")
    val bestSeller: List<BestSellerModel>
)
