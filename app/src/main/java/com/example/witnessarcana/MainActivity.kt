package com.example.witnessarcana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.witnessarcana.databinding.ActivityMainBinding

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


        // Navbar Logic
        binding.btnNav1.setOnClickListener {
            filterDeck("maj")
            showMinorFilters(false)
        }
        binding.btnNav2.setOnClickListener {
            filterDeck("min")
            showMinorFilters(true)
        }
        binding.btnNav3.setOnClickListener {
            showMinorFilters(false)
        }
        binding.btnNav4.setOnClickListener {
            showMinorFilters(false)
        }

        // Minor Arcana Filter Logic
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

    // For showing or hiding "Minor Arcana" filters.
    private fun showMinorFilters(boolean: Boolean) {
        if (boolean) {
            binding.minorFilters.visibility = View.VISIBLE
            mainViewModel.displayMinorFilters(true)
        }
        else {
            binding.minorFilters.visibility = View.GONE
            mainViewModel.displayMinorFilters(false)
        }
    }


}