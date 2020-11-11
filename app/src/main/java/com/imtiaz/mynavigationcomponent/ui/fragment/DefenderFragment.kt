package com.imtiaz.mynavigationcomponent.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.imtiaz.mynavigationcomponent.data.DEFENDER
import com.imtiaz.mynavigationcomponent.data.getPlayerListByPositionKey
import com.imtiaz.mynavigationcomponent.databinding.FragmentDefenderBinding
import com.imtiaz.mynavigationcomponent.ui.adapter.PlayerListAdapter

class DefenderFragment : Fragment() {

    private lateinit var _binding: FragmentDefenderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDefenderBinding.inflate(inflater)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding.rvPlayerList.apply {
            adapter = PlayerListAdapter(requireContext(), getPlayerListByPositionKey(DEFENDER)) {}
        }
    }

}