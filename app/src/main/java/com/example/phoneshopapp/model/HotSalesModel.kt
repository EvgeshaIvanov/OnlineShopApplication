package com.example.phoneshopapp.model

import com.google.gson.annotations.SerializedName

data class HotSalesModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("subtitle")
    val subtitle: String,
    @SerializedName("picture")
    val picture: String,
    var isNew: Boolean = true
)
