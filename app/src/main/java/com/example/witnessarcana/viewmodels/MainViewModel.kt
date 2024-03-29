package com.example.witnessarcana.viewmodels

import androidx.lifecycle.ViewModel
import com.example.witnessarcana.models.TarotCard
import com.example.witnessarcana.models.TarotDeck

class MainViewModel : ViewModel() {

    private val tarotDeck: TarotDeck = TarotDeck()
    private lateinit var currentFilter: String
    private var currentMinorFilter: String = "swords"
    private lateinit var currentDeck: MutableList<TarotCard>
    private var minorFiltersShowing: Boolean = false


    fun getFilteredCards(suite_filter: String): MutableList<TarotCard> {
        currentFilter = suite_filter
        val filteredDeck = mutableListOf<TarotCard>()
        tarotDeck.deck.forEach {
            if (it.suite.contains(suite_filter)) {
                filteredDeck.add(it)
            }
        }
        currentDeck = filteredDeck
        return filteredDeck
    }
    fun getCurrentDeck(): MutableList<TarotCard> {
        return currentDeck
    }

    fun displayMinorFilters(boolean: Boolean) {
        minorFiltersShowing = boolean
    }



}