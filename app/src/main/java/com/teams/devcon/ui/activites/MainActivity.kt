package com.teams.devcon.ui.activites

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.NavController
import com.teams.devcon.data.prefrences.SharedPrefs
import com.teams.devcon.databinding.ActivityMainBinding
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private var _binding : ActivityMainBinding ?=null
    private val binding get() = _binding!!

    private lateinit var navController: NavController

    private val sharedPres : SharedPrefs by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setUI()
    }

    private fun setUI(){
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
