package com.example.smarthydroponicssystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smarthydroponicssystem.databinding.ActivityMainBinding
import com.example.smarthydroponicssystem.util.MainTabAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val fragmentList = listOf(PlantFragment(), ControlSystemFragment(), ConnectionFragment())

        val adapter = MainTabAdapter(this)
        adapter.plantFragmentList = fragmentList
        binding.mainViewPager.adapter = adapter

        val tabText = listOf("식물 정보", "시스템 관리", "연결 관리")
        TabLayoutMediator(binding.mainTabLayout, binding.mainViewPager) { tab, position ->
            tab.text = tabText[position]
        }.attach()
    }
}