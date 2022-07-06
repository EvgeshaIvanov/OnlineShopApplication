package com.example.phoneshopapp.mainScreen.presentation.adapter.bestSeller

import android.annotation.SuppressLint
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.phoneshopapp.R
import com.example.phoneshopapp.databinding.ItemBestSellerBinding
import com.example.phoneshopapp.mainScreen.domain.models.BestSellerModel

class BestSellerAdapter : RecyclerView.Adapter<BestSellerViewHolder>() {

    var onPhoneClickListener: ((BestSellerModel) -> Unit)? = null

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

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: BestSellerViewHolder, position: Int) {
        val item = list[position]
        with(holder.binding) {
            bestSellerImage.load(item.picture)
            priceWithoutDiscount.apply {
                paintFlags = paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                text = "\$${item.priceWithoutDiscount}"

            }
            discountPrice.text = "\$${item.discountPrice}"
            phoneName.text = item.title
            if (item.isFavorites) {
                addToFavoriteButton.setImageResource(R.drawable.favorite)
            } else {
                addToFavoriteButton.setImageResource(R.drawable.favorite_border)
            }
            cardPhone.setOnClickListener {
                onPhoneClickListener?.invoke(item)
            }
        }
    }

    override fun getItemCount() = list.size

}


