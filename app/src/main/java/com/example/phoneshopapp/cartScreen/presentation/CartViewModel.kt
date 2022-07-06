package com.example.phoneshopapp.cartScreen.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.phoneshopapp.cartScreen.data.CartRepositoryImpl
import com.example.phoneshopapp.cartScreen.domain.model.BasketModel
import com.example.phoneshopapp.cartScreen.domain.model.CartModel
import com.example.phoneshopapp.cartScreen.domain.repository.CartRepository
import com.example.phoneshopapp.cartScreen.domain.usecase.GetCartUseCase
import kotlinx.coroutines.launch

class CartViewModel : ViewModel() {

    val cartInfoList = MutableLiveData<CartModel>()

    private val repository = CartRepositoryImpl()

    private val getCartUseCase = GetCartUseCase(repository)

    init {
        cartInfo()
    }

    fun cartInfo() {
        viewModelScope.launch {
            val list = getCartUseCase.execute()
            cartInfoList.postValue(list)
        }
    }

    fun offerInfo() {
        viewModelScope.launch {

        }
    }

}