package com.example.witnessarcana.activities

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.witnessarcana.R
import com.example.witnessarcana.databinding.FragmentCardReaderBinding
import com.example.witnessarcana.models.TarotCard
import com.example.witnessarcana.viewmodels.CardReaderViewModel

class CardReaderFragment(private val selected_card: TarotCard) : Fragment() {

    private var _binding: FragmentCardReaderBinding? = null
    private val binding get() = _binding!!

    private lateinit var cardReaderViewModel: CardReaderViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCardReaderBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel: CardReaderViewModel by activityViewModels()
        cardReaderViewModel = viewModel

        setCardImage()

        binding.tvCardTitle2.text = selected_card.title

        binding.btnReturnToDeck.setOnClickListener {
            (context as MainActivity).hideFragment()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun setCardImage() {

        when (selected_card.id) {
            "maj0" -> { binding.ivCardImage.setImageResource(R.drawable.fool) }
            "maj1" -> { binding.ivCardImage.setImageResource(R.drawable.magician) }
            "maj2" -> { binding.ivCardImage.setImageResource(R.drawable.priestess) }
            "maj3" -> { binding.ivCardImage.setImageResource(R.drawable.empress) }
            "maj4" -> { binding.ivCardImage.setImageResource(R.drawable.emperor) }
            "maj5" -> { binding.ivCardImage.setImageResource(R.drawable.hierophant) }
            "maj6" -> { binding.ivCardImage.setImageResource(R.drawable.lovers) }
            "maj7" -> { binding.ivCardImage.setImageResource(R.drawable.chariot) }
            "maj8" -> { binding.ivCardImage.setImageResource(R.drawable.strength) }
            "maj9" -> { binding.ivCardImage.setImageResource(R.drawable.hermit) }
            "maj10" -> { binding.ivCardImage.setImageResource(R.drawable.wheel) }
            "maj11" -> { binding.ivCardImage.setImageResource(R.drawable.justice) }
            "maj12" -> { binding.ivCardImage.setImageResource(R.drawable.hangedman) }
            "maj13" -> { binding.ivCardImage.setImageResource(R.drawable.death) }
            "maj14" -> { binding.ivCardImage.setImageResource(R.drawable.temperance) }
            "maj15" -> { binding.ivCardImage.setImageResource(R.drawable.devil) }
            "maj16" -> { binding.ivCardImage.setImageResource(R.drawable.tower) }
            "maj17" -> { binding.ivCardImage.setImageResource(R.drawable.star) }
            "maj18" -> { binding.ivCardImage.setImageResource(R.drawable.moon) }
            "maj19" -> { binding.ivCardImage.setImageResource(R.drawable.sun) }
            "maj20" -> { binding.ivCardImage.setImageResource(R.drawable.judgement) }
            "maj21" -> { binding.ivCardImage.setImageResource(R.drawable.world) }

            "min_wands1" -> { binding.ivCardImage.setImageResource(R.drawable.ace_wands)}
            "min_wands2" -> { binding.ivCardImage.setImageResource(R.drawable.two_wands)}
            "min_wands3" -> { binding.ivCardImage.setImageResource(R.drawable.three_wands)}
            "min_wands4" -> { binding.ivCardImage.setImageResource(R.drawable.four_wands)}
            "min_wands5" -> { binding.ivCardImage.setImageResource(R.drawable.five_wands)}
            "min_wands6" -> { binding.ivCardImage.setImageResource(R.drawable.six_wands)}
            "min_wands7" -> { binding.ivCardImage.setImageResource(R.drawable.seven_wands)}
            "min_wands8" -> { binding.ivCardImage.setImageResource(R.drawable.eight_wands)}
            "min_wands9" -> { binding.ivCardImage.setImageResource(R.drawable.nine_wands)}
            "min_wands10" -> { binding.ivCardImage.setImageResource(R.drawable.ten_wands)}
            "min_wands11" -> { binding.ivCardImage.setImageResource(R.drawable.page_wands)}
            "min_wands12" -> { binding.ivCardImage.setImageResource(R.drawable.knight_wands)}
            "min_wands13" -> { binding.ivCardImage.setImageResource(R.drawable.queen_wands)}
            "min_wands14" -> { binding.ivCardImage.setImageResource(R.drawable.king_wands)}

            "min_cups1" -> { binding.ivCardImage.setImageResource(R.drawable.ace_cups)}
            "min_cups2" -> { binding.ivCardImage.setImageResource(R.drawable.two_cups)}
            "min_cups3" -> { binding.ivCardImage.setImageResource(R.drawable.three_cups)}
            "min_cups4" -> { binding.ivCardImage.setImageResource(R.drawable.four_cups)}
            "min_cups5" -> { binding.ivCardImage.setImageResource(R.drawable.five_cups)}
            "min_cups6" -> { binding.ivCardImage.setImageResource(R.drawable.six_cups)}
            "min_cups7" -> { binding.ivCardImage.setImageResource(R.drawable.seven_cups)}
            "min_cups8" -> { binding.ivCardImage.setImageResource(R.drawable.eight_cups)}
            "min_cups9" -> { binding.ivCardImage.setImageResource(R.drawable.nine_cups)}
            "min_cups10" -> { binding.ivCardImage.setImageResource(R.drawable.ten_cups)}
            "min_cups11" -> { binding.ivCardImage.setImageResource(R.drawable.page_cups)}
            "min_cups12" -> { binding.ivCardImage.setImageResource(R.drawable.knight_cups)}
            "min_cups13" -> { binding.ivCardImage.setImageResource(R.drawable.queen_cups)}
            "min_cups14" -> { binding.ivCardImage.setImageResource(R.drawable.king_cups)}

            "min_pents1" -> { binding.ivCardImage.setImageResource(R.drawable.ace_pents)}
            "min_pents2" -> { binding.ivCardImage.setImageResource(R.drawable.two_pents)}
            "min_pents3" -> { binding.ivCardImage.setImageResource(R.drawable.three_pents)}
            "min_pents4" -> { binding.ivCardImage.setImageResource(R.drawable.four_pents)}
            "min_pents5" -> { binding.ivCardImage.setImageResource(R.drawable.five_pents)}
            "min_pents6" -> { binding.ivCardImage.setImageResource(R.drawable.six_pents)}
            "min_pents7" -> { binding.ivCardImage.setImageResource(R.drawable.seven_pents)}
            "min_pents8" -> { binding.ivCardImage.setImageResource(R.drawable.eight_pents)}
            "min_pents9" -> { binding.ivCardImage.setImageResource(R.drawable.nine_pents)}
            "min_pents10" -> { binding.ivCardImage.setImageResource(R.drawable.ten_pents)}
            "min_pents11" -> { binding.ivCardImage.setImageResource(R.drawable.page_pents)}
            "min_pents12" -> { binding.ivCardImage.setImageResource(R.drawable.knight_pents)}
            "min_pents13" -> { binding.ivCardImage.setImageResource(R.drawable.queen_pents)}
            "min_pents14" -> { binding.ivCardImage.setImageResource(R.drawable.king_pents)}

            "min_swords1" -> { binding.ivCardImage.setImageResource(R.drawable.ace_swords)}
            "min_swords2" -> { binding.ivCardImage.setImageResource(R.drawable.two_swords)}
            "min_swords3" -> { binding.ivCardImage.setImageResource(R.drawable.three_swords)}
            "min_swords4" -> { binding.ivCardImage.setImageResource(R.drawable.four_swords)}
            "min_swords5" -> { binding.ivCardImage.setImageResource(R.drawable.five_swords)}
            "min_swords6" -> { binding.ivCardImage.setImageResource(R.drawable.six_swords)}
            "min_swords7" -> { binding.ivCardImage.setImageResource(R.drawable.seven_swords)}
            "min_swords8" -> { binding.ivCardImage.setImageResource(R.drawable.eight_swords)}
            "min_swords9" -> { binding.ivCardImage.setImageResource(R.drawable.nine_swords)}
            "min_swords10" -> { binding.ivCardImage.setImageResource(R.drawable.ten_swords)}
            "min_swords11" -> { binding.ivCardImage.setImageResource(R.drawable.page_swords)}
            "min_swords12" -> { binding.ivCardImage.setImageResource(R.drawable.knight_swords)}
            "min_swords13" -> { binding.ivCardImage.setImageResource(R.drawable.queen_swords)}
            "min_swords14" -> { binding.ivCardImage.setImageResource(R.drawable.king_swords)}
        }
    }

}