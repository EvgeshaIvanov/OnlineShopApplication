package com.example.phoneshopapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.lifecycle.ViewModelProvider
import com.example.phoneshopapp.databinding.FragmentBestSellerBinding
import com.example.phoneshopapp.databinding.FragmentFilterBestSellerBinding

class FilterBestSellerFragment : Fragment() {
    //TODO добавить фильтр
    private lateinit var binding: FragmentFilterBestSellerBinding

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFilterBestSellerBinding.inflate(inflater, container, false)
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
        binding.brandDropdownMenu.setOnItemClickListener { _, _, position, _ ->
            binding.applyFilterButton.setOnClickListener {
                val filterName = brandAdapter.getItem(position)
                Log.i("FILTER", filterName.toString())
            }
        }
        binding.closeFilterButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .detach(this)
                .commit()
        }
        return binding.root
    }


}