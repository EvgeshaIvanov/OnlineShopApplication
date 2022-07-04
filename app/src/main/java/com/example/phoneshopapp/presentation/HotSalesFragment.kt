package com.example.phoneshopapp.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.phoneshopapp.databinding.FragmentHotSalesBinding

class HotSalesFragment : Fragment() {

    private lateinit var viewModel: MainViewModel

    private lateinit var adapter: ViewPagerAdapter

    private lateinit var binding: FragmentHotSalesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHotSalesBinding.inflate(inflater, container, false)
        adapter = ViewPagerAdapter()
        binding.viewPager.adapter = adapter
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.hotSalesPhones.observe(viewLifecycleOwner) { phones ->
            adapter.list = phones
        }
        return binding.root
    }


//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        val repository = Repository()
//        lifecycleScope.launch {
//            val response = repository.hotSales()
//            val adapter = ViewPagerAdapter()
//            adapter.list = response.body()!!.homeStore
//            binding.viewPager.adapter = adapter
//            binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
//                override fun onPageScrolled(
//                    position: Int,
//                    positionOffset: Float,
//                    positionOffsetPixels: Int
//                ) {
//                    super.onPageScrolled(position, positionOffset, positionOffsetPixels)
//                    Log.i("SwapRight", position.toString())
//                    adapter.list[position].isNew = false
//                }
//
//            })
//            Log.i("ResponseFromBack", response.body()?.homeStore.toString())
//            Log.i("ResponseFromBack", response.body()?.bestSeller.toString())
//        }
//    }
}