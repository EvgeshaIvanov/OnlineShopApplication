package com.example.phoneshopapp.cartScreen.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.phoneshopapp.cartScreen.data.CartRepositoryImpl
import com.example.phoneshopapp.cartScreen.domain.model.ResponseCartModel
import com.example.phoneshopapp.cartScreen.domain.usecase.GetCartUseCase
import kotlinx.coroutines.launch

class CartViewModel : ViewModel() {

    val cartInfoList = MutableLiveData<ResponseCartModel>()

    private val repository = CartRepositoryImpl()

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