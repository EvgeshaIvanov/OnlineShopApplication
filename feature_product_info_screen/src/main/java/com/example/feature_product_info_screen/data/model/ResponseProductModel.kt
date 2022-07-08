package com.example.feature_product_info_screen.data.model

import com.example.feature_product_info_screen.domain.model.ProductModel
import com.google.gson.annotations.SerializedName

data class ResponseProductModel(
    @SerializedName("images")
    val images: List<String>
) {
    fun mapToProductModel(): ProductModel {
        return ProductModel(this.images)
    }
}
