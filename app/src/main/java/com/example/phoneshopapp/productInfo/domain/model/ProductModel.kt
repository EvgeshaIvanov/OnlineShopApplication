package com.example.phoneshopapp.productInfo.domain.model

import com.google.gson.annotations.SerializedName

data class ProductModel(
    @SerializedName("images")
    val images: List<String>
)
