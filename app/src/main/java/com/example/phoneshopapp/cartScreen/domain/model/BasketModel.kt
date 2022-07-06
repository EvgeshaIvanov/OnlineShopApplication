package com.example.phoneshopapp.cartScreen.domain.model

import com.google.gson.annotations.SerializedName

data class BasketModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("images")
    val image: String,
    @SerializedName("price")
    val price: Int,
    @SerializedName("title")
    val name: String
)
