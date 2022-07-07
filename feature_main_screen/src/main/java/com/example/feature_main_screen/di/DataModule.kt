package com.example.feature_main_screen.di

import com.example.feature_main_screen.data.repository.RepositoryImpl
import com.example.feature_main_screen.domain.repository.Repository
import org.koin.dsl.module

val dataModule = module {

    single<Repository> { RepositoryImpl() }

}