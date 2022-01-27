package com.example.smarthydroponicssystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smarthydroponicssystem.databinding.ActivityMainBinding
import com.example.smarthydroponicssystem.util.MainTabAdapter

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val fragmentList = listOf(ConnectionFragment(), ControlSystemFragment(), PlantFragment())

        val adapter = MainTabAdapter(this)
        adapter.plantFragmentList = fragmentList
        binding.mainViewPager.adapter = adapter
    }
}