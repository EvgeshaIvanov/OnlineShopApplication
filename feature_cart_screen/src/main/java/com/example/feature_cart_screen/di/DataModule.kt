package com.example.feature_cart_screen.di

import com.example.feature_cart_screen.data.repository.RepositoryImpl
import com.example.feature_cart_screen.domain.repository.Repository
import org.koin.dsl.module

val dataModule = module {

    single<Repository> { RepositoryImpl() }

}