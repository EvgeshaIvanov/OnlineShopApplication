package com.example.phoneshopapp.app

import android.app.Application
import com.example.feature_cart_screen.di.cartModules
import com.example.feature_main_screen.di.mainScreenModules
import com.example.feature_product_info_screen.di.productInfoModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.module.Module

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(getKoinModules())
        }
    }

    private fun getKoinModules(): List<Module> = mutableListOf<Module>().apply {
        addAll(mainScreenModules)
        addAll(productInfoModules)
        addAll(cartModules)
    }

}