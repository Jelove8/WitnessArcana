package com.example.witnessarcana.adapters

import android.media.Image
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.witnessarcana.R
import com.example.witnessarcana.models.TarotCard

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
        val currentCard = tarotDeck[position]
        holder.tvTitle.text = currentCard.title
        holder.setCardImage(currentCard.tag)
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

    val tvTitle: TextView = itemView.findViewById(R.id.textView)
    val imageView: ImageView = itemView.findViewById(R.id.iv)

    fun setCardImage(card_tag: String) {
        when (card_tag) {
            "maj0" -> { imageView.setImageResource(R.drawable.fool) }
            "maj1" -> { imageView.setImageResource(R.drawable.magician) }
            "maj2" -> { imageView.setImageResource(R.drawable.priestess) }
            "maj3" -> { imageView.setImageResource(R.drawable.empress) }
            "maj4" -> { imageView.setImageResource(R.drawable.emperor) }
            "maj5" -> { imageView.setImageResource(R.drawable.hierophant) }
            "maj6" -> { imageView.setImageResource(R.drawable.lovers) }
            "maj7" -> { imageView.setImageResource(R.drawable.chariot) }
            "maj8" -> { imageView.setImageResource(R.drawable.strength) }
            "maj9" -> { imageView.setImageResource(R.drawable.hermit) }
            "maj10" -> { imageView.setImageResource(R.drawable.wheel) }
            "maj11" -> { imageView.setImageResource(R.drawable.justice) }
            "maj12" -> { imageView.setImageResource(R.drawable.hangedman) }
            "maj13" -> { imageView.setImageResource(R.drawable.death) }
            "maj14" -> { imageView.setImageResource(R.drawable.temperance) }
            "maj15" -> { imageView.setImageResource(R.drawable.devil) }
            "maj16" -> { imageView.setImageResource(R.drawable.tower) }
            "maj17" -> { imageView.setImageResource(R.drawable.star) }
            "maj18" -> { imageView.setImageResource(R.drawable.moon) }
            "maj19" -> { imageView.setImageResource(R.drawable.sun) }
            "maj20" -> { imageView.setImageResource(R.drawable.judgement) }
            "maj21" -> { imageView.setImageResource(R.drawable.world) }

            "min_wands1" -> { imageView.setImageResource(R.drawable.ace_wands)}
            "min_wands2" -> { imageView.setImageResource(R.drawable.two_wands)}
            "min_wands3" -> { imageView.setImageResource(R.drawable.three_wands)}
            "min_wands4" -> { imageView.setImageResource(R.drawable.four_wands)}
            "min_wands5" -> { imageView.setImageResource(R.drawable.five_wands)}
            "min_wands6" -> { imageView.setImageResource(R.drawable.six_wands)}
            "min_wands7" -> { imageView.setImageResource(R.drawable.seven_wands)}
            "min_wands8" -> { imageView.setImageResource(R.drawable.eight_wands)}
            "min_wands9" -> { imageView.setImageResource(R.drawable.nine_wands)}
            "min_wands10" -> { imageView.setImageResource(R.drawable.ten_wands)}
            "min_wands11" -> { imageView.setImageResource(R.drawable.page_wands)}
            "min_wands12" -> { imageView.setImageResource(R.drawable.knight_wands)}
            "min_wands13" -> { imageView.setImageResource(R.drawable.queen_wands)}
            "min_wands14" -> { imageView.setImageResource(R.drawable.king_wands)}

            "min_cups1" -> { imageView.setImageResource(R.drawable.ace_cups)}
            "min_cups2" -> { imageView.setImageResource(R.drawable.two_cups)}
            "min_cups3" -> { imageView.setImageResource(R.drawable.three_cups)}
            "min_cups4" -> { imageView.setImageResource(R.drawable.four_cups)}
            "min_cups5" -> { imageView.setImageResource(R.drawable.five_cups)}
            "min_cups6" -> { imageView.setImageResource(R.drawable.six_cups)}
            "min_cups7" -> { imageView.setImageResource(R.drawable.seven_cups)}
            "min_cups8" -> { imageView.setImageResource(R.drawable.eight_cups)}
            "min_cups9" -> { imageView.setImageResource(R.drawable.nine_cups)}
            "min_cups10" -> { imageView.setImageResource(R.drawable.ten_cups)}
            "min_cups11" -> { imageView.setImageResource(R.drawable.page_cups)}
            "min_cups12" -> { imageView.setImageResource(R.drawable.knight_cups)}
            "min_cups13" -> { imageView.setImageResource(R.drawable.queen_cups)}
            "min_cups14" -> { imageView.setImageResource(R.drawable.king_cups)}

            "min_pents1" -> { imageView.setImageResource(R.drawable.ace_pents)}
            "min_pents2" -> { imageView.setImageResource(R.drawable.two_pents)}
            "min_pents3" -> { imageView.setImageResource(R.drawable.three_pents)}
            "min_pents4" -> { imageView.setImageResource(R.drawable.four_pents)}
            "min_pents5" -> { imageView.setImageResource(R.drawable.five_pents)}
            "min_pents6" -> { imageView.setImageResource(R.drawable.six_pents)}
            "min_pents7" -> { imageView.setImageResource(R.drawable.seven_pents)}
            "min_pents8" -> { imageView.setImageResource(R.drawable.eight_pents)}
            "min_pents9" -> { imageView.setImageResource(R.drawable.nine_pents)}
            "min_pents10" -> { imageView.setImageResource(R.drawable.ten_pents)}
            "min_pents11" -> { imageView.setImageResource(R.drawable.page_pents)}
            "min_pents12" -> { imageView.setImageResource(R.drawable.knight_pents)}
            "min_pents13" -> { imageView.setImageResource(R.drawable.queen_pents)}
            "min_pents14" -> { imageView.setImageResource(R.drawable.king_pents)}

            "min_swords1" -> { imageView.setImageResource(R.drawable.ace_swords)}
            "min_swords2" -> { imageView.setImageResource(R.drawable.two_swords)}
            "min_swords3" -> { imageView.setImageResource(R.drawable.three_swords)}
            "min_swords4" -> { imageView.setImageResource(R.drawable.four_swords)}
            "min_swords5" -> { imageView.setImageResource(R.drawable.five_swords)}
            "min_swords6" -> { imageView.setImageResource(R.drawable.six_swords)}
            "min_swords7" -> { imageView.setImageResource(R.drawable.seven_swords)}
            "min_swords8" -> { imageView.setImageResource(R.drawable.eight_swords)}
            "min_swords9" -> { imageView.setImageResource(R.drawable.nine_swords)}
            "min_swords10" -> { imageView.setImageResource(R.drawable.ten_swords)}
            "min_swords11" -> { imageView.setImageResource(R.drawable.page_swords)}
            "min_swords12" -> { imageView.setImageResource(R.drawable.knight_swords)}
            "min_swords13" -> { imageView.setImageResource(R.drawable.queen_swords)}
            "min_swords14" -> { imageView.setImageResource(R.drawable.king_swords)}
        }
    }

}
