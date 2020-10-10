package com.imtiaz.mynavigationcomponent.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.imtiaz.mynavigationcomponent.data.FORWARD
import com.imtiaz.mynavigationcomponent.data.getPlayerListByPositionKey
import com.imtiaz.mynavigationcomponent.databinding.FragmentForwardBinding
import com.imtiaz.mynavigationcomponent.ui.adapter.PlayerListAdapter

class ForwardFragment : Fragment() {

    private lateinit var _binding: FragmentForwardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentForwardBinding.inflate(inflater)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding.rvPlayerList.apply {
            adapter = PlayerListAdapter(requireContext(), getPlayerListByPositionKey(FORWARD)){}
        }
    }
}