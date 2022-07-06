package com.example.phoneshopapp.mainScreen.presentation

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.phoneshopapp.databinding.ItemHotSalesViewPagerBinding
import com.example.phoneshopapp.mainScreen.domain.models.HotSalesModel


class ViewPagerAdapter : RecyclerView.Adapter<ViewPagerViewHolder>() {

    var list = emptyList<HotSalesModel>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemHotSalesViewPagerBinding.inflate(layoutInflater, parent, false)
        return ViewPagerViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val sale = list[position]
        with(holder.binding) {
            hsMainText.text = sale.title
            hsSecondText.text = sale.subtitle
            hsImage.load(sale.picture) {
                crossfade(1000)
                build()
            }
            if (!sale.isNew) hsLogoNewSales.visibility = View.INVISIBLE
        }
    }

    override fun getItemCount() = list.size

}

