package com.example.feature_main_screen.domain.models

import com.google.gson.annotations.SerializedName

data class BestSellerModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("price_without_discount")
    val priceWithoutDiscount: Int,
    @SerializedName("discount_price")
    val discountPrice: Int,
    @SerializedName("picture")
    val picture: String,
    @SerializedName("is_favorites")
    val isFavorites: Boolean
)
