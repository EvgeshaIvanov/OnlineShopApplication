package com.example.phoneshopapp.presentation

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.phoneshopapp.databinding.ItemBestSellerBinding
import com.example.phoneshopapp.domain.models.BestSellerModel

class BestSellerAdapter : RecyclerView.Adapter<BestSellerViewHolder>() {

    var list = emptyList<BestSellerModel>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BestSellerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemBestSellerBinding.inflate(layoutInflater, parent, false)
        return BestSellerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BestSellerViewHolder, position: Int) {
        val item = list[position]
        with(holder.binding) {
            bestSellerImage.load(item.picture)
            priceWithoutDiscount.text = "\$${item.priceWithoutDiscount.toString()}"
            discountPrice.text = "\$${item.discountPrice.toString()}"
            phoneName.text = item.title
        }
    }

    override fun getItemCount() = list.size

}

class BestSellerViewHolder(val binding: ItemBestSellerBinding) :
    RecyclerView.ViewHolder(binding.root)
