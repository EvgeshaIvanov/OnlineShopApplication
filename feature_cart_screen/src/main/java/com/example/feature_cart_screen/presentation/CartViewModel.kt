package com.example.feature_cart_screen.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.feature_cart_screen.data.model.ResponseCartModel
import com.example.feature_cart_screen.data.repository.RepositoryImpl
import com.example.feature_cart_screen.domain.usecase.GetCartUseCase
import kotlinx.coroutines.launch

class CartViewModel : ViewModel() {

    val cartInfoList = MutableLiveData<ResponseCartModel>()

    private val repository = RepositoryImpl()

    private val getCartUseCase = GetCartUseCase(repository)

    init {
        cartInfo()
    }

    private fun cartInfo() {
        viewModelScope.launch {
            val list = getCartUseCase.execute()
            cartInfoList.postValue(list)
        }
    }

}