package com.example.phoneshopapp.mainScreen.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.phoneshopapp.R
import com.example.phoneshopapp.databinding.FragmentBestSellerBinding


class BestSellerFragment : Fragment() {

    private lateinit var binding: FragmentBestSellerBinding

    private lateinit var phoneAdapter: BestSellerAdapter

    private lateinit var viewModel: MainViewModel

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
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
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