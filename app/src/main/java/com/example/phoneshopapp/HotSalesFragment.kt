package com.example.phoneshopapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.viewpager2.widget.ViewPager2
import com.example.phoneshopapp.databinding.FragmentHotSalesBinding
import com.example.phoneshopapp.network.Repository
import kotlinx.coroutines.launch

class HotSalesFragment : Fragment() {

    private lateinit var binding: FragmentHotSalesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHotSalesBinding.inflate(inflater, container, false)

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val repository = Repository()
        lifecycleScope.launch {
            val response = repository.hotSales()
            val adapter = ViewPagerAdapter()
            adapter.list = response.body()!!.homeStore
            binding.viewPager.adapter = adapter
            binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
                override fun onPageScrolled(
                    position: Int,
                    positionOffset: Float,
                    positionOffsetPixels: Int
                ) {
                    super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                    Log.i("SwapRight", position.toString())
                    adapter.list[position].isNew = false
                }

            })
            Log.i("ResponseFromBack", response.body()?.homeStore.toString())
            Log.i("ResponseFromBack", response.body()?.bestSeller.toString())
        }
    }
}