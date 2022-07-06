package com.example.phoneshopapp.mainScreen.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ScrollView
import androidx.fragment.app.Fragment
import com.example.phoneshopapp.R
import com.example.phoneshopapp.databinding.FragmentMainScreenBinding


class MainScreenFragment : Fragment() {

    private lateinit var binding: FragmentMainScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainScreenBinding.inflate(inflater, container, false)
        if (savedInstanceState == null) {
            initFragment(R.id.container_horizontal_menu, SelectCategoryFragment())
            initFragment(R.id.container_hot_sales, HotSalesFragment())
            initFragment(R.id.container_best_sellers, BestSellerFragment())
        }
        binding.filterSettings.setOnClickListener {
            initFragment(R.id.container_filter, FilterBestSellerFragment())
            binding.scrollView.postDelayed({
                binding.scrollView.fullScroll(ScrollView.FOCUS_DOWN)
            }, 550)
        }
        return binding.root
    }

    private fun initFragment(container: Int, fragment: Fragment) {
        parentFragmentManager.beginTransaction()
            .replace(container, fragment)
            .commit()
    }
}