package com.example.feature_main_screen.di

import com.example.feature_main_screen.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel<MainViewModel> {
        MainViewModel()
    }

}