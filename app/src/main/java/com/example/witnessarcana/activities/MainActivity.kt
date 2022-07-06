package com.example.witnessarcana.activities

import android.graphics.Typeface
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.witnessarcana.R
import com.example.witnessarcana.adapters.TarotDeckAdapter
import com.example.witnessarcana.databinding.ActivityMainBinding
import com.example.witnessarcana.models.TarotCard
import com.example.witnessarcana.viewmodels.CardReaderViewModel
import com.example.witnessarcana.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel
    private lateinit var tarotDeckAdapter: TarotDeckAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        tarotDeckAdapter = TarotDeckAdapter(mainViewModel.getFilteredCards("maj"))
        binding.mainRecycler.layoutManager = LinearLayoutManager(this)
        binding.mainRecycler.adapter = tarotDeckAdapter



        // Minor Arcana Filter Logic
        binding.btnFilterMajors.setOnClickListener {
            filterDeck("maj")
        }
        binding.btnFilterWands.setOnClickListener {
            filterDeck("wands")
        }
        binding.btnFilterCups.setOnClickListener {
            filterDeck("cups")
        }
        binding.btnFilterPentacles.setOnClickListener {
            filterDeck("pents")
        }
        binding.btnFilterSwords.setOnClickListener {
            filterDeck("swords")
        }

    }


    // Updates adapter when a filter is selected.
    private fun filterDeck(filter: String) {
        val newDeck = mainViewModel.getFilteredCards(filter)
        tarotDeckAdapter.updateAdapter(newDeck)
    }



    // For changing color of navbar buttons.
    private fun setNavbarColors(mode: Int) {



    }



    /*
    private fun setNavbarColors(mode: Int) {

        if (mode != 0) {
            val black = ContextCompat.getColor(applicationContext,R.color.black)
            binding.btnFilterMajors.setBackgroundColor(black)
            binding.bt.setBackgroundColor(black)
            binding.btnNav3.setBackgroundColor(black)
            binding.btnNav4.setBackgroundColor(black)

            val gray = ContextCompat.getColor(applicationContext,R.color.gray)
            when (mode) {
                1 -> { binding.btnNav1.setBackgroundColor(gray) }
                2 -> { binding.btnNav2.setBackgroundColor(gray) }
                3 -> { binding.btnNav3.setBackgroundColor(gray) }
                4 -> { binding.btnNav4.setBackgroundColor(gray) }
            }
        }
    }
    */





}