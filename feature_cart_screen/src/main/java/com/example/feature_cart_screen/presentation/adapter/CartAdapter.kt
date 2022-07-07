package com.example.feature_cart_screen.presentation.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.feature_cart_screen.databinding.ItemCartBinding
import com.example.feature_cart_screen.domain.model.BasketModel

class CartAdapter : RecyclerView.Adapter<CartViewHolder>() {

    var cartList = emptyList<BasketModel>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemCartBinding.inflate(layoutInflater, parent, false)
        return CartViewHolder(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val item = cartList[position]
        with(holder.binding) {
            phoneImage.load(item.image)
            phoneName.text = item.name
            costPhone.text = "\$${item.price}"
        }
    }

    override fun getItemCount() = cartList.size

}


