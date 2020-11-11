package com.imtiaz.mynavigationcomponent.ui.fragment

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.imtiaz.mynavigationcomponent.R
import com.imtiaz.mynavigationcomponent.databinding.FragmentDevInfoBinding
import com.imtiaz.mynavigationcomponent.utils.APP_PREF
import com.imtiaz.mynavigationcomponent.utils.PREF_DEV_IMAGE
import com.imtiaz.mynavigationcomponent.utils.PREF_DEV_NAME
import com.imtiaz.mynavigationcomponent.utils.PREF_DEV_SKILLS

class DevInfoFragment : Fragment() {

    private lateinit var _binding: FragmentDevInfoBinding

    private val pref: SharedPreferences by lazy {
        requireContext().getSharedPreferences(
            APP_PREF,
            Context.MODE_PRIVATE
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initPrefValue()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDevInfoBinding.inflate(inflater)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        updateDevInfo()
    }

    private fun initPrefValue() {
        if(pref.getString(PREF_DEV_NAME, null) == null){
            pref.edit().apply {
                putString(PREF_DEV_NAME, "Imtiaz Dipto")
                putString(PREF_DEV_SKILLS, "Mobile App Developer | Android | iOS")
                putString(PREF_DEV_IMAGE, "https://i.ibb.co/4ZX5kb0/THrq-Mox-E-400x400.jpg")
                apply()
            }
        }
    }

    private fun updateDevInfo() = _binding.apply {
        Glide.with(requireContext())
            .load(pref.getString(PREF_DEV_IMAGE, null))
            .error(R.drawable.ic_placeholder)
            .placeholder(R.drawable.ic_placeholder)
            .into(ivDevImage)

        tvName.text = pref.getString(PREF_DEV_NAME, null) ?: "Not Found"
        tvDevSkills.text = pref.getString(PREF_DEV_SKILLS, null) ?: "Not Found"
    }
}