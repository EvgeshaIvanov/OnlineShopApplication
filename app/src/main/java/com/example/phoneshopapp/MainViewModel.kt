package com.example.phoneshopapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.phoneshopapp.model.BestSellerModel
import com.example.phoneshopapp.network.Repository
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val repository = Repository()

    val bestSellerPhones = MutableLiveData<List<BestSellerModel>>()

    init {
        phonesList()
    }

    private fun phonesList() {
        viewModelScope.launch {
            val list = repository.hotSales().body()?.bestSeller
            bestSellerPhones.postValue(list)
        }
    }

}