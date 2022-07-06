package com.example.witnessarcana.models

import android.graphics.drawable.Drawable

data class TarotDeck(val deck: MutableList<TarotCard> = mutableListOf(
    TarotCard("The Fool","maj0"),
    TarotCard("The Magician","maj1"),
    TarotCard("The High Priestess","maj2"),
    TarotCard("The Empress","maj3"),
    TarotCard("The Emperor","maj4"),
    TarotCard("The Hierophant","maj5"),
    TarotCard("The Lovers","maj6"),
    TarotCard("The Chariot","maj7"),
    TarotCard("Strength","maj8"),
    TarotCard("The Hermit","maj9"),
    TarotCard("The Wheel of Fortune","maj10"),
    TarotCard("Justice","maj11"),
    TarotCard("The Hanged Man","maj12"),
    TarotCard("Death","maj13"),
    TarotCard("Temperance","maj14"),
    TarotCard("The Devil","maj15"),
    TarotCard("The Tower","maj16"),
    TarotCard("The Star","maj17"),
    TarotCard("The Moon","maj18"),
    TarotCard("The Sun","maj19"),
    TarotCard("Judgement","maj20"),
    TarotCard("The World","maj21"),

    TarotCard("Ace of Wands","min_wands1"),
    TarotCard("Two of Wands","min_wands2"),
    TarotCard("Three of Wands","min_wands3"),
    TarotCard("Four of Wands","min_wands4"),
    TarotCard("Five of Wands","min_wands5"),
    TarotCard("Six of Wands","min_wands6"),
    TarotCard("Seven of Wands","min_wands7"),
    TarotCard("Eight of Wands","min_wands8"),
    TarotCard("Nine of Wands","min_wands9"),
    TarotCard("Ten of Wands","min_wands10"),
    TarotCard("Page of Wands","min_wands11"),
    TarotCard("Knight of Wands","min_wands12"),
    TarotCard("Queen of Wands","min_wands13"),
    TarotCard("King of Wands","min_wands14"),

    TarotCard("Ace of Cups","min_cups1"),
    TarotCard("Two of Cups","min_cups2"),
    TarotCard("Three of Cups","min_cups3"),
    TarotCard("Four of Cups","min_cups4"),
    TarotCard("Five of Cups","min_cups5"),
    TarotCard("Six of Cups","min_cups6"),
    TarotCard("Seven of Cups","min_cups7"),
    TarotCard("Eight of Cups","min_cups8"),
    TarotCard("Nine of Cups","min_cups9"),
    TarotCard("Ten of Cups","min_cups10"),
    TarotCard("Page of Cups","min_cups11"),
    TarotCard("Knight of Cups","min_cups12"),
    TarotCard("Queen of Cups","min_cups13"),
    TarotCard("King of Cups","min_cups14"),

    TarotCard("Ace of Pentacles","min_pents1"),
    TarotCard("Two of Pentacles","min_pents2"),
    TarotCard("Three of Pentacles","min_pents3"),
    TarotCard("Four of Pentacles","min_pents4"),
    TarotCard("Five of Pentacles","min_pents5"),
    TarotCard("Six of Pentacles","min_pents6"),
    TarotCard("Seven of Pentacles","min_pents7"),
    TarotCard("Eight of Pentacles","min_pents8"),
    TarotCard("Nine of Pentacles","min_pents9"),
    TarotCard("Ten of Pentacles","min_pents10"),
    TarotCard("Page of Pentacles","min_pents11"),
    TarotCard("Knight of Pentacles","min_pents12"),
    TarotCard("Queen of Pentacles","min_pents13"),
    TarotCard("King of Pentacles","min_pents14"),

    TarotCard("Ace of Swords","min_swords1"),
    TarotCard("Two of Swords","min_swords2"),
    TarotCard("Three of Swords","min_swords3"),
    TarotCard("Four of Swords","min_swords4"),
    TarotCard("Five of Swords","min_swords5"),
    TarotCard("Six of Swords","min_swords6"),
    TarotCard("Seven of Swords","min_swords7"),
    TarotCard("Eight of Swords","min_swords8"),
    TarotCard("Nine of Swords","min_swords9"),
    TarotCard("Ten of Swords","min_swords10"),
    TarotCard("Page of Swords","min_swords11"),
    TarotCard("Knight of Swords","min_swords12"),
    TarotCard("Queen of Swords","min_swords13"),
    TarotCard("King of Swords","min_swords14"),

    )
)




data class TarotCard(
    val title: String,
    val tag: String
) {

}
