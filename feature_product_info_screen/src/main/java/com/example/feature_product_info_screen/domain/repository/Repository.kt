package com.example.feature_product_info_screen.domain.repository

interface Repository {

    suspend fun getPhoneInfo(): List<String>

}