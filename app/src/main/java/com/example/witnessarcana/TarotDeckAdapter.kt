package com.example.witnessarcana

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class TarotDeckAdapter(
    var tarotDeck: MutableList<TarotCard>
) : RecyclerView.Adapter<TarotCardViewHolder>() {

    init {
        Log.d("Initial", "Adapter initialized.")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarotCardViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.select_major_viewholder, parent, false)

        return TarotCardViewHolder(view)
    }

    override fun onBindViewHolder(holder: TarotCardViewHolder, position: Int) {
        holder.tvTitle.text = tarotDeck[position].title

    }


    override fun getItemCount(): Int {
        return tarotDeck.size
    }

    fun updateAdapter(newDeck: MutableList<TarotCard>) {
        tarotDeck = newDeck
        notifyDataSetChanged()
    }
}

class TarotCardViewHolder(ItemView:View) : RecyclerView.ViewHolder(ItemView) {

    val tvTitle: TextView = itemView.findViewById(R.id.tv_card_title)

}
