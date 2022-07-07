package com.example.feature_main_screen.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.feature_main_screen.R
import com.example.feature_main_screen.databinding.FragmentFilterBestSellerBinding
import com.example.feature_main_screen.presentation.MainViewModel

class FilterBestSellerFragment : Fragment() {

    private lateinit var binding: FragmentFilterBestSellerBinding

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFilterBestSellerBinding.inflate(inflater, container, false)
        setupDropDownMenu()
        return binding.root
    }

    private fun setupDropDownMenu() {
        val brand = resources.getStringArray(R.array.brand)
        val brandAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, brand)
        binding.brandDropdownMenu.setAdapter(brandAdapter)
        val price = resources.getStringArray(R.array.price)
        val priceAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, price)
        binding.priceDropdownMenu.setAdapter(priceAdapter)
        val size = resources.getStringArray(R.array.size)
        val sizeAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, size)
        binding.sizeDropdownMenu.setAdapter(sizeAdapter)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        binding.applyFilterButton.setOnClickListener {
            closeFragment()
        }
        binding.closeFilterButton.setOnClickListener {
            closeFragment()
        }
    }

    private fun closeFragment() {
        parentFragmentManager.beginTransaction()
            .detach(this)
            .commit()
    }
}