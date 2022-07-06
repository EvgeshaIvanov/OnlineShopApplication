package com.example.phoneshopapp.productInfo.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.example.phoneshopapp.R
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
        initViewPager()
        productViewModel = ViewModelProvider(this)[ProductViewModel::class.java]
        productViewModel.getPhoneInfo()
        productViewModel.phoneInfo.observe(viewLifecycleOwner) { images ->
            adapter.list = images
        }
        binding.cartButton.setOnClickListener {
            findNavController().navigate(R.id.action_productInfoFragment_to_cartFragment)
        }

        return binding.root
    }

    private fun initViewPager() {
        adapter = ProductInfoViewPager()
        binding.viewPager.apply {
            offscreenPageLimit = 1
            val rv = getChildAt(0) as RecyclerView
            rv.apply {
                val padding = resources.getDimensionPixelOffset(R.dimen.pageMargin) +
                        resources.getDimensionPixelOffset(R.dimen.pageMarginAndoffset)
                setPadding(padding, 0, padding, 0)
                clipToPadding = false
            }
        }
        binding.viewPager.adapter = adapter
    }

}