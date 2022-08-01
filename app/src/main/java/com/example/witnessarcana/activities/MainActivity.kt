package com.example.witnessarcana.activities

import android.graphics.Typeface
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.ViewModelProvider
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

        tarotDeckAdapter = TarotDeckAdapter(mainViewModel.getFilteredCards("Majors"),
            itemClickCallback = fun(selected_card: TarotCard) {
                replaceCardReaderFragment(selected_card)
                binding.fragmentContainerView2.visibility = View.VISIBLE

        })

        binding.mainRecycler.layoutManager = LinearLayoutManager(this)
        binding.mainRecycler.adapter = tarotDeckAdapter

        // Initially sets "Majors" as the selected filter.
        setNavbarColors(1)


        // Minor Arcana Filter Logic
        binding.btnFilterMajors.setOnClickListener {
            filterDeck("Majors")
            setNavbarColors(1)
        }
        binding.btnFilterWands.setOnClickListener {
            filterDeck("Wands")
            setNavbarColors(2)
        }
        binding.btnFilterCups.setOnClickListener {
            filterDeck("Cups")
            setNavbarColors(3)
        }
        binding.btnFilterPentacles.setOnClickListener {
            filterDeck("Pentacles")
            setNavbarColors(4)
        }
        binding.btnFilterSwords.setOnClickListener {
            filterDeck("Swords")
            setNavbarColors(5)
        }

    }


    // Updates adapter when a filter is selected.
    private fun filterDeck(suite_filter: String) {
        val newDeck = mainViewModel.getFilteredCards(suite_filter)
        tarotDeckAdapter.updateAdapter(newDeck)
    }



    // For changing color of navbar buttons.
    private fun setNavbarColors(mode: Int) {

        val nightingale = ResourcesCompat.getFont(this, R.font.dt_nightingale)

        // Setting each navbar button to default style.
        binding.btnFilterMajors.text = "Majors\n\n"
        binding.btnFilterWands.text = "Wands\n\n"
        binding.btnFilterCups.text = "Cups\n\n"
        binding.btnFilterPentacles.text = "Pentacles\n\n"
        binding.btnFilterSwords.text = "Swords\n\n"

        binding.btnFilterMajors.setTypeface(nightingale,Typeface.NORMAL)
        binding.btnFilterWands.setTypeface(nightingale,Typeface.NORMAL)
        binding.btnFilterCups.setTypeface(nightingale,Typeface.NORMAL)
        binding.btnFilterPentacles.setTypeface(nightingale,Typeface.NORMAL)
        binding.btnFilterSwords.setTypeface(nightingale,Typeface.NORMAL)

        // Applying the emphasized style to the button pressed.
        when (mode) {
            1 -> {
                binding.btnFilterMajors.text = "Majors\n\n*"
                binding.btnFilterMajors.setTypeface(nightingale,Typeface.BOLD)
            }
            2 -> {
                binding.btnFilterWands.text = "Wands\n\n*"
                binding.btnFilterWands.setTypeface(nightingale,Typeface.BOLD)
            }
            3 -> {
                binding.btnFilterCups.text = "Cups\n\n*"
                binding.btnFilterCups.setTypeface(nightingale,Typeface.BOLD)
            }
            4 -> {
                binding.btnFilterPentacles.text = "Pentacles\n\n*"
                binding.btnFilterPentacles.setTypeface(nightingale,Typeface.BOLD)
            }
            5 -> {
                binding.btnFilterSwords.text = "Swords\n\n*"
                binding.btnFilterSwords.setTypeface(nightingale,Typeface.BOLD)
            }
        }
    }

    private fun replaceCardReaderFragment(selected_card: TarotCard) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView2, CardReaderFragment(selected_card))
        transaction.commit()
    }
    fun hideFragment() {
        binding.fragmentContainerView2.visibility = View.GONE
    }







}