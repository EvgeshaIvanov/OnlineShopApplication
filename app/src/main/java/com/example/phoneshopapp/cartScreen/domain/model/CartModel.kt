package com.example.phoneshopapp.cartScreen.domain.model

import com.google.gson.annotations.SerializedName

data class CartModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("basket")
    val basket: List<BasketModel>,
    @SerializedName("delivery")
    val delivery: String,
    @SerializedName("total")
    val total: Int
)
