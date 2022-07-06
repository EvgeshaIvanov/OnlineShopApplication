package com.example.phoneshopapp.productInfo.domain.repository

interface Repository {

    suspend fun getPhoneInfo(): List<String>

}