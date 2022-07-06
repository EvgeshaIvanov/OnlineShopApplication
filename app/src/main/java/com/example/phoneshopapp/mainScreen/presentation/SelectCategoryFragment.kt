package com.example.phoneshopapp.mainScreen.presentation

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.phoneshopapp.R
import com.example.phoneshopapp.databinding.FragmentSelectCategoryBinding
import com.google.android.material.card.MaterialCardView


class SelectCategoryFragment : Fragment() {

    private lateinit var binding: FragmentSelectCategoryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSelectCategoryBinding.inflate(inflater, container, false)
        binding.selectPhonesCardView.select()
        binding.selectPhonesCardView.setOnClickListener {

            Log.i("CLICK", "DWADW")

            //findNavController().navigate(R.id.action_selectCategoryFragment_to_blankFragment2, null)
        }
        initComputerCardView()
        initPhonesCardView()
        initBookCardView()
        initHealthCardView()
        initExampleCardView()

        return binding.root
    }

    fun initComputerCardView() {
        with(binding) {
            selectComputersCardView.setOnClickListener {
                selectComputersCardView.select()
                selectPhonesCardView.unselect()
                selectHealthCardView.unselect()
                selectBooksCardView.unselect()
                selectExampleCardView.unselect()
            }
        }
    }

    fun initPhonesCardView() {
        with(binding) {
            selectPhonesCardView.setOnClickListener {
//                findNavController().navigate(R.id.action_mainScreenFragment_to_blankFragment)
////                if(findNavController().currentDestination?.id==R.id.selectCategoryFragment){
////                    findNavController().navigate(R.id.action_mainScreenFragment_to_blankFragment)
////                }


                Log.i("CLICK", "DWADW")
                selectComputersCardView.unselect()
                selectPhonesCardView.select()
                selectHealthCardView.unselect()
                selectBooksCardView.unselect()
                selectExampleCardView.unselect()
            }
        }
    }

    fun initHealthCardView() {
        with(binding) {
            selectHealthCardView.setOnClickListener {
                selectComputersCardView.unselect()
                selectPhonesCardView.unselect()
                selectHealthCardView.select()
                selectBooksCardView.unselect()
                selectExampleCardView.unselect()
            }
        }
    }

    fun initBookCardView() {
        with(binding) {
            selectBooksCardView.setOnClickListener {
                selectComputersCardView.unselect()
                selectPhonesCardView.unselect()
                selectHealthCardView.unselect()
                selectBooksCardView.select()
                selectExampleCardView.unselect()
            }
        }
    }

    fun initExampleCardView() {
        with(binding) {
            selectExampleCardView.setOnClickListener {
                selectComputersCardView.unselect()
                selectPhonesCardView.unselect()
                selectHealthCardView.unselect()
                selectBooksCardView.unselect()
                selectExampleCardView.select()
            }
        }
    }

    fun MaterialCardView.select() {
        this.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#FF6E4E"))
    }

    fun MaterialCardView.unselect() {
        this.backgroundTintList = ColorStateList.valueOf(Color.WHITE)
    }

}