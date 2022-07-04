package com.example.phoneshopapp.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.phoneshopapp.data.PhoneRepositoryImpl
import com.example.phoneshopapp.domain.models.BestSellerModel
import com.example.phoneshopapp.domain.models.HotSalesModel
import com.example.phoneshopapp.domain.usecase.BestSellerUseCase
import com.example.phoneshopapp.domain.usecase.HotSalesUseCase
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val phoneRepository = PhoneRepositoryImpl()
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