package com.example.smarthydroponicssystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.smarthydroponicssystem.databinding.ActivityMainBinding
import com.example.smarthydroponicssystem.util.PlantTabAdapter

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val fragmentList = listOf(ConnectionFragment(), ControlSystemFragment(), SelectPlantFragment())

        val adapter = PlantTabAdapter(this)
        adapter.plantFragmentList = fragmentList
        binding.mainViewPager.adapter = adapter
    }
}