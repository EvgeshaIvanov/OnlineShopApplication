package com.example.phoneshopapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.phoneshopapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.filterSettings.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container_filter, FilterBestSellerFragment())
                .commit()
        }
        supportFragmentManager
            .beginTransaction()
            .add(R.id.container_horizontal_menu, SelectCategoryFragment())
            .commit()
        supportFragmentManager
            .beginTransaction()
            .add(R.id.container_hot_sales, HotSalesFragment())
            .commit()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container_best_sellers, BestSellerFragment())
            .commit()


    }
}