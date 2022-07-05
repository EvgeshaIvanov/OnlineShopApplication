package com.example.phoneshopapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.phoneshopapp.databinding.ActivityMainBinding
import com.example.phoneshopapp.databinding.FragmentMainScreenBinding
import com.example.phoneshopapp.presentation.BestSellerFragment
import com.example.phoneshopapp.presentation.FilterBestSellerFragment
import com.example.phoneshopapp.presentation.HotSalesFragment
import com.example.phoneshopapp.presentation.SelectCategoryFragment


class MainScreenFragment : Fragment() {
    private lateinit var binding: FragmentMainScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainScreenBinding.inflate(inflater, container, false)
        binding.filterSettings.setOnClickListener {
            val navController = Navigation.findNavController(requireView())
            findNavController().navigate(R.id.action_mainScreenFragment_to_blankFragment)
//            parentFragmentManager
//                .beginTransaction()
//                .replace(R.id.container_filter, FilterBestSellerFragment())
//                .commit()
        }
        parentFragmentManager
            .beginTransaction()
            .add(R.id.container_horizontal_menu, SelectCategoryFragment())
            .commit()
        parentFragmentManager
            .beginTransaction()
            .add(R.id.container_hot_sales, HotSalesFragment())
            .commit()
        parentFragmentManager
            .beginTransaction()
            .replace(R.id.container_best_sellers, BestSellerFragment())
            .commit()
        return binding.root
    }

}