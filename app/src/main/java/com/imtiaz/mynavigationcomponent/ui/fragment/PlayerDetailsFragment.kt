package com.imtiaz.mynavigationcomponent.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.imtiaz.mynavigationcomponent.R
import com.imtiaz.mynavigationcomponent.databinding.FragmentForwardBinding
import com.imtiaz.mynavigationcomponent.databinding.FragmentPlayerDetailsBinding

class PlayerDetailsFragment : Fragment() {

    private lateinit var _binding: FragmentPlayerDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentPlayerDetailsBinding.inflate(inflater)
        return _binding.root
    }
}