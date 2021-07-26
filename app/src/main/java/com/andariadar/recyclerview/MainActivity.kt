package com.andariadar.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.andariadar.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var countryList: List<Country>
    private lateinit var adapter: CountryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initialListOfCountries()
        initAdapter()
    }

    private fun initialListOfCountries() {
        countryList = listOf(
            Country(0, "Australia", "Canberra", R.drawable.ic_australia),
            Country(1, "Austria", "Vienna", R.drawable.ic_austria),
            Country(2, "Belgium", "Brussels", R.drawable.ic_belgium),
            Country(3, "Canada", "Ottawa", R.drawable.ic_canada),
            Country(4, "France", "Paris", R.drawable.ic_france),
            Country(5, "Germany", "Berlin", R.drawable.ic_germany),
            Country(6, "Iran", "Tehran", R.drawable.ic_iran),
            Country(7, "Japan", "Tokyo", R.drawable.ic_japan),
            Country(8, "Romania", "Bucharest", R.drawable.ic_romania),
            Country(9, "Russia", "Moscow", R.drawable.ic_russia),
            Country(10, "Switzerland", "Bern", R.drawable.ic_switzerland),
            Country(11, "United Kingdom", "London", R.drawable.ic_united_kingdom)
        )
    }

    private fun initAdapter() {
        adapter = CountryAdapter()
        binding.apply {
            recyclerView.adapter = adapter
        }

        adapter.submitList(countryList)
    }
}