package com.example.phoneshopapp.cartScreen.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.phoneshopapp.cartScreen.presentation.adapter.CartAdapter
import com.example.phoneshopapp.databinding.FragmentCartBinding


class CartFragment : Fragment() {

    private lateinit var binding: FragmentCartBinding

    private lateinit var cartAdapter: CartAdapter

    private lateinit var viewModel: CartViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCartBinding.inflate(inflater, container, false)
        cartAdapter = CartAdapter()
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = cartAdapter
        }
        viewModel = ViewModelProvider(this)[CartViewModel::class.java]
        viewModel.cartInfoList.observe(viewLifecycleOwner) { items ->
            cartAdapter.cartList = items.basket
            binding.totalCost.text = "\$${items.total}"
            binding.deliveryInfo.text = items.delivery
        }
        binding.backButton.setOnClickListener {
            requireActivity().onBackPressed()
        }
        return binding.root
    }

}