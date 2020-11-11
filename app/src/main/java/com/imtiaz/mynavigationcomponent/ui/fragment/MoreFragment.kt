package com.imtiaz.mynavigationcomponent.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.imtiaz.mynavigationcomponent.R
import com.imtiaz.mynavigationcomponent.databinding.FragmentMoreBinding
import com.imtiaz.mynavigationcomponent.databinding.FragmentPlayerDetailsBinding

class MoreFragment : Fragment() {

    private lateinit var _binding: FragmentMoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMoreBinding.inflate(inflater)
        return _binding.root
    }
}