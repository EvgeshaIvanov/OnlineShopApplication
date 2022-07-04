package com.example.phoneshopapp.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.phoneshopapp.databinding.FragmentBestSellerBinding


class BestSellerFragment : Fragment() {

    private lateinit var binding: FragmentBestSellerBinding

    private lateinit var phoneAdapter: BestSellerAdapter

    private lateinit var viewModel: MainViewModel

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBestSellerBinding.inflate(inflater, container, false)


        phoneAdapter = BestSellerAdapter()
        binding.recyclerViewBestSeller.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = phoneAdapter
        }
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]


        viewModel.bestSellerPhones.observe(viewLifecycleOwner) { phones ->
            phoneAdapter.list = phones
        }



        return binding.root
    }
}