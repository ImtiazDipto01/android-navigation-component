package com.imtiaz.mynavigationcomponent.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.imtiaz.mynavigationcomponent.R
import com.imtiaz.mynavigationcomponent.databinding.ActivityMainBinding
import com.imtiaz.mynavigationcomponent.ui.fragment.MidfielderFragment

class MainActivity : AppCompatActivity() {

    private lateinit var _binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        initFragment()
    }

    private fun initFragment(){
        val fragmentTag = "DefenderFragment"
        supportFragmentManager.beginTransaction()
            .add(R.id.container, MidfielderFragment(), fragmentTag)
            .commit()
    }
}