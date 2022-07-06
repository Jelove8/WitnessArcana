package com.example.witnessarcana.activities

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.witnessarcana.databinding.FragmentCardReaderBinding
import com.example.witnessarcana.viewmodels.CardReaderViewModel

class CardReaderFragment() : Fragment() {

    private var _binding: FragmentCardReaderBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: CardReaderViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCardReaderBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}