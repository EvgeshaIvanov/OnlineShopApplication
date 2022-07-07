package com.example.feature_product_info_screen.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.feature_product_info_screen.R
import com.example.feature_product_info_screen.databinding.FragmentProductInfoBinding
import com.example.feature_product_info_screen.presentation.adapter.ProductInfoViewPager
import org.koin.androidx.viewmodel.ext.android.viewModel

class ProductInfoFragment : Fragment() {

    private val productViewModel by viewModel<ProductViewModel>()

    private lateinit var adapter: ProductInfoViewPager

    private lateinit var binding: FragmentProductInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProductInfoBinding.inflate(inflater, container, false)
        initViewPager()

        productViewModel.getPhoneInfo()
        productViewModel.phoneInfo.observe(viewLifecycleOwner) { images ->
            adapter.list = images
        }
        binding.cartButton.setOnClickListener {
            findNavController().navigate(R.id.action_productInfoFragment_to_cartFragment)
        }
        binding.backButton.setOnClickListener {
            requireActivity().onBackPressed()
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