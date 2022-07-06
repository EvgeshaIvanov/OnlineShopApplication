package com.example.phoneshopapp.productInfo.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.phoneshopapp.productInfo.data.RepositoryImpl
import com.example.phoneshopapp.productInfo.domain.usecase.GetPhoneUseCase
import kotlinx.coroutines.launch

class ProductViewModel : ViewModel() {

    private val repository = RepositoryImpl()

    private val getPhoneUseCase = GetPhoneUseCase(repository)

    val phoneInfo = MutableLiveData<List<String>>()

    fun getPhoneInfo() {
        viewModelScope.launch {
            val list = getPhoneUseCase.execute()
            phoneInfo.postValue(list)
        }
    }

}