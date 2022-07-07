package com.example.feature_cart_screen.di

import com.example.feature_cart_screen.presentation.CartViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel<CartViewModel> {
        CartViewModel()
    }

}