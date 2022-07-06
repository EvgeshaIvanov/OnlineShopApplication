package com.example.phoneshopapp.productInfo.presentation.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.phoneshopapp.databinding.ItemProductDetailsViewPagerBinding

class ProductInfoViewPager : RecyclerView.Adapter<ProductInfoViewHolder>() {

    var list = emptyList<String>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductInfoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemProductDetailsViewPagerBinding.inflate(layoutInflater, parent, false)
        return ProductInfoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductInfoViewHolder, position: Int) {
        val image = list[position]
        holder.binding.phoneImage.load(image)
    }

    override fun getItemCount() = list.size

}


