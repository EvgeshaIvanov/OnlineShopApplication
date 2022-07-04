package com.example.phoneshopapp.presentation

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.phoneshopapp.databinding.ItemHotSalesViewPagerBinding
import com.example.phoneshopapp.domain.models.HotSalesModel


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
            when (sale.isNew) {
                true -> {
                    hsMainText.text = sale.title
                    hsSecondText.text = sale.subtitle
                    hsImage.load(sale.picture) {
                        crossfade(1000)
                        build()
                    }
                    hsLogoNewSales.visibility = View.VISIBLE
                }
                else -> {
                    hsMainText.text = sale.title
                    hsSecondText.text = sale.subtitle
                    hsImage.load(sale.picture) {
                        crossfade(1000)
                        build()
                    }
                    hsLogoNewSales.visibility = View.INVISIBLE
                }
            }


        }
    }

    override fun getItemCount() = list.size
}

class ViewPagerViewHolder(val binding: ItemHotSalesViewPagerBinding) :
    RecyclerView.ViewHolder(binding.root)