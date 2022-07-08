package com.example.feature_main_screen.di

import com.example.feature_main_screen.data.network.ApiHelper
import com.example.feature_main_screen.domain.usecase.BestSellerUseCase
import com.example.feature_main_screen.domain.usecase.HotSalesUseCase
import com.example.phoneshopapp.utils.BaseDataSource
import org.koin.dsl.module

val domainModule = module {

    factory<HotSalesUseCase> {
        HotSalesUseCase(repository = get())
    }

    factory<BestSellerUseCase> {
        BestSellerUseCase(repository = get())
    }

    single<BaseDataSource> { ApiHelper(apiService = get()) }
}