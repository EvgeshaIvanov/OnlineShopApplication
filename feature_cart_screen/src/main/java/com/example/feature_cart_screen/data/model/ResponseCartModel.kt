package com.example.feature_cart_screen.data.model

import com.example.feature_cart_screen.domain.model.BasketMainModel
import com.example.feature_cart_screen.domain.model.BasketModel
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
) {

    fun mapToBasketMainModel(): BasketMainModel {
        return BasketMainModel(this.basket, this.delivery, this.total)
    }

}
