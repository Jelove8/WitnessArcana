package com.example.witnessarcana.viewmodels

import androidx.lifecycle.ViewModel
import com.example.witnessarcana.models.TarotCard

class CardReaderViewModel : ViewModel() {

    private var currentCard: TarotCard = TarotCard("Error","error","error",0)

    fun setCurrentCard(newCard: TarotCard) {
        currentCard = newCard
    }
    fun getCurrentCard(): TarotCard {
        return currentCard
    }

}