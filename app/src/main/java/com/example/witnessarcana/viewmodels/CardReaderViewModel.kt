package com.example.witnessarcana.viewmodels

import androidx.lifecycle.ViewModel
import com.example.witnessarcana.models.TarotCard

class CardReaderViewModel : ViewModel() {

    private lateinit var currentCard: TarotCard

    fun setCurrentCard(newCard: TarotCard) {
        currentCard = newCard
    }
    fun getCurrentCard(): TarotCard {
        return currentCard
    }

}