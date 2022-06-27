package com.example.phoneshopapp

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
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
        initComputerCardView()
        initPhonesCardView()
        initBookCardView()
        initHealthCardView()
        initExampleCardView()

        return binding.root
    }

    fun initComputerCardView(){
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
    fun initPhonesCardView(){
        with(binding) {
            selectPhonesCardView.setOnClickListener {
                selectComputersCardView.unselect()
                selectPhonesCardView.select()
                selectHealthCardView.unselect()
                selectBooksCardView.unselect()
                selectExampleCardView.unselect()
            }
        }
    }
    fun initHealthCardView(){
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
    fun initBookCardView(){
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
    fun initExampleCardView(){
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