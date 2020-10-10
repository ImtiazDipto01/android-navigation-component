package com.imtiaz.mynavigationcomponent.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.imtiaz.mynavigationcomponent.data.MIDFIELDER
import com.imtiaz.mynavigationcomponent.data.getPlayerListByPositionKey
import com.imtiaz.mynavigationcomponent.databinding.FragmentMidfielderBinding
import com.imtiaz.mynavigationcomponent.ui.adapter.PlayerListAdapter

class MidfielderFragment : Fragment() {

    private lateinit var _binding: FragmentMidfielderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentMidfielderBinding.inflate(inflater)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding.rvPlayerList.apply {
            adapter = PlayerListAdapter(requireContext(), getPlayerListByPositionKey(MIDFIELDER)){}
        }
    }
}