package com.example.feature_cart_screen.di

import com.example.feature_cart_screen.domain.network.ApiHelper
import com.example.feature_cart_screen.domain.usecase.GetCartUseCase
import com.example.phoneshopapp.utils.BaseDataSource
import org.koin.dsl.module

val domainModule = module {

    factory<GetCartUseCase> {
        GetCartUseCase(repository = get())
    }

    single<BaseDataSource> { ApiHelper(apiService = get()) }
}