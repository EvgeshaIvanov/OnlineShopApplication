package com.example.feature_main_screen.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.feature_main_screen.R
import com.example.feature_main_screen.databinding.FragmentBestSellerBinding
import com.example.feature_main_screen.presentation.MainViewModel
import com.example.feature_main_screen.presentation.adapter.bestSeller.BestSellerAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel


class BestSellerFragment : Fragment() {

    private lateinit var binding: FragmentBestSellerBinding

    private lateinit var phoneAdapter: BestSellerAdapter
//
    private val viewModel by viewModel<MainViewModel>()
//    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBestSellerBinding.inflate(inflater, container, false)
        initRecyclerView()
        initViewModel()
        return binding.root
    }

    private fun initViewModel() {
//        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.bestSellerPhones.observe(viewLifecycleOwner) { phones ->
            phoneAdapter.list = phones
        }
    }

    private fun initRecyclerView() {
        phoneAdapter = BestSellerAdapter()
        binding.recyclerViewBestSeller.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = phoneAdapter
        }
        phoneAdapter.onPhoneClickListener = {
            findNavController().navigate(R.id.action_mainScreenFragment_to_productInfoFragment)
        }
    }
}