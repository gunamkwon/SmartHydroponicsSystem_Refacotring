package com.example.smarthydroponicssystem

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.smarthydroponicssystem.databinding.FragmentControlSystemBinding
import com.example.smarthydroponicssystem.util.PlantTabAdapter
import com.google.android.material.tabs.TabLayoutMediator

class ConnectionFragment: Fragment() {

    private lateinit var binding: FragmentControlSystemBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentControlSystemBinding.inflate(inflater, container, false)


        val fragmentList = listOf(SensorStatusFragment(), SensorControlFragment())
        val adapter = PlantTabAdapter(requireActivity())
        adapter.plantFragmentList = fragmentList

        binding.controlViewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.controlViewPager) { tab, position ->

            when(position) {
                0 -> tab.text = "센서 상태"
                1 -> tab.text = "원격 관리"
            }
        }.attach()

        return binding.root
    }
}