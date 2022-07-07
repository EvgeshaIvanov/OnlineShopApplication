package com.example.feature_product_info_screen.di

import com.example.feature_product_info_screen.presentation.ProductViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel<ProductViewModel> {
        ProductViewModel()
    }

}