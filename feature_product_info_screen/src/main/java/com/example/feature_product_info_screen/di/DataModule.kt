package com.example.feature_product_info_screen.di

import com.example.feature_product_info_screen.data.RepositoryImpl
import com.example.feature_product_info_screen.domain.repository.Repository
import org.koin.dsl.module

val dataModule = module {

    single<Repository> { RepositoryImpl() }

}