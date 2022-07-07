package com.example.feature_main_screen.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.feature_main_screen.data.repository.RepositoryImpl
import com.example.feature_main_screen.domain.models.BestSellerModel
import com.example.feature_main_screen.domain.models.HotSalesModel
import com.example.feature_main_screen.domain.usecase.BestSellerUseCase
import com.example.feature_main_screen.domain.usecase.HotSalesUseCase
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val phoneRepository = RepositoryImpl()

    private val hotSalesUseCase = HotSalesUseCase(phoneRepository)

    private val bestSellerUseCase = BestSellerUseCase(phoneRepository)

    val bestSellerPhones = MutableLiveData<List<BestSellerModel>>()

    val hotSalesPhones = MutableLiveData<List<HotSalesModel>>()

    init {
        bestSellerPhones()
        hotSalesPhone()
    }

    private fun bestSellerPhones() {
        viewModelScope.launch {
            val list = bestSellerUseCase.execute()
            bestSellerPhones.postValue(list)
        }
    }

    private fun hotSalesPhone() {
        viewModelScope.launch {
            val list = hotSalesUseCase.execute()
            hotSalesPhones.postValue(list)
        }
    }

}