package com.example.feature_cart_screen.domain.model

data class BasketMainModel(
    val basket: List<BasketModel>,
    val delivery: String,
    val total: Int
)
