package com.example.phoneshopapp.cartScreen.data.model

import com.example.phoneshopapp.cartScreen.domain.model.BasketModel
import com.google.gson.annotations.SerializedName

data class ResponseCartModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("basket")
    val basket: List<BasketModel>,
    @SerializedName("delivery")
    val delivery: String,
    @SerializedName("total")
    val total: Int
)
