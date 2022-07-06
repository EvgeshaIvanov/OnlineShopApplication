package com.example.phoneshopapp.productInfo.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.phoneshopapp.databinding.FragmentProductInfoBinding

class ProductInfoFragment : Fragment() {

    private lateinit var productViewModel: ProductViewModel

    private lateinit var adapter: ProductInfoViewPager

    private lateinit var binding: FragmentProductInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProductInfoBinding.inflate(inflater, container, false)
        adapter = ProductInfoViewPager()
        binding.viewPager.adapter = adapter
        productViewModel = ViewModelProvider(this)[ProductViewModel::class.java]
        productViewModel.getPhoneInfo()
        productViewModel.phoneInfo.observe(viewLifecycleOwner) { images ->
            adapter.list = images
        }

        return binding.root
    }

}