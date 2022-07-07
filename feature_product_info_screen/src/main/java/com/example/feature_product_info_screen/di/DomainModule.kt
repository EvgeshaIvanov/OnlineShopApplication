package com.example.feature_product_info_screen.di

import com.example.feature_product_info_screen.domain.network.ApiHelper
import com.example.feature_product_info_screen.domain.usecase.GetPhoneUseCase
import com.example.phoneshopapp.utils.BaseDataSource
import org.koin.dsl.module

val domainModule = module {

    factory<GetPhoneUseCase> {
        GetPhoneUseCase(repository = get())
    }

    single<BaseDataSource> { ApiHelper(apiService = get()) }
}