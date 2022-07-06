package com.example.phoneshopapp.mainScreen.domain.models

import com.google.gson.annotations.Expose
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
    @SerializedName("is_new")
    var isNew: Boolean = false
)
