package com.example.feature_product_info_screen.domain.model

import com.google.gson.annotations.SerializedName

data class ProductModel(
    @SerializedName("images")
    val images: List<String>
)
