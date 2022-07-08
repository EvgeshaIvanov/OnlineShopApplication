package com.example.feature_product_info_screen.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.feature_product_info_screen.data.repository.RepositoryImpl
import com.example.feature_product_info_screen.domain.usecase.GetPhoneUseCase
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