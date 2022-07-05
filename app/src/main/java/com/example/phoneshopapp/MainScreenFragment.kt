package com.example.phoneshopapp

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ScrollView
import androidx.fragment.app.FragmentContainer
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.phoneshopapp.databinding.ActivityMainBinding
import com.example.phoneshopapp.databinding.FragmentMainScreenBinding
import com.example.phoneshopapp.presentation.BestSellerFragment
import com.example.phoneshopapp.presentation.FilterBestSellerFragment
import com.example.phoneshopapp.presentation.HotSalesFragment
import com.example.phoneshopapp.presentation.SelectCategoryFragment


class MainScreenFragment : Fragment() {

    //TODO bottom sheet or floating action button
    private lateinit var binding: FragmentMainScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainScreenBinding.inflate(inflater, container, false)

        initFragment(R.id.container_horizontal_menu, SelectCategoryFragment())
        initFragment(R.id.container_hot_sales, HotSalesFragment())
        initFragment(R.id.container_best_sellers, BestSellerFragment())
//        binding.filterSettings.setOnClickListener {
////
////            parentFragmentManager
////                .beginTransaction()
////                .replace(R.id.container_filter, FilterBestSellerFragment())
////                .commit()
//            val handler = Handler(Looper.getMainLooper())
//           handler.post{initFragment(R.id.container_filter, FilterBestSellerFragment())}
//            binding.scrollView.postDelayed({
//                binding.scrollView.fullScroll(ScrollView.FOCUS_DOWN)
//            }, 2000)
//        }
        return binding.root
    }

    private fun initFragment(container: Int, fragment: Fragment) {
        parentFragmentManager.beginTransaction()
            .replace(container, fragment)
            .commit()
    }
}