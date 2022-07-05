package com.example.witnessarcana

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val tarotDeck: TarotDeck = TarotDeck()
    private lateinit var currentFilter: String
    private lateinit var currentDeck: MutableList<TarotCard>
    private var minorFiltersShowing: Boolean = false


    fun getFilteredCards(filter: String): MutableList<TarotCard> {
        currentFilter = filter
        val filteredDeck = mutableListOf<TarotCard>()
        tarotDeck.deck.forEach {
            if (it.tag.contains(filter)) {
                filteredDeck.add(it)
            }
        }
        return filteredDeck
    }

    fun displayMinorFilters(boolean: Boolean) {
        minorFiltersShowing = boolean
    }



}