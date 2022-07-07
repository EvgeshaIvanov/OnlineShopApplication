package com.example.feature_main_screen.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.feature_main_screen.databinding.FragmentHotSalesBinding
import com.example.feature_main_screen.presentation.MainViewModel
import com.example.feature_main_screen.presentation.adapter.hotSales.HotSalesViewPagerAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class HotSalesFragment : Fragment() {

//    private lateinit var viewModel: MainViewModel
private val viewModel by viewModel<MainViewModel>()
    private lateinit var adapterHotSales: HotSalesViewPagerAdapter

    private lateinit var binding: FragmentHotSalesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHotSalesBinding.inflate(inflater, container, false)
        adapterHotSales = HotSalesViewPagerAdapter()
        binding.viewPager.adapter = adapterHotSales
//        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.hotSalesPhones.observe(viewLifecycleOwner) { phones ->
            adapterHotSales.list = phones
        }
        return binding.root
    }

}