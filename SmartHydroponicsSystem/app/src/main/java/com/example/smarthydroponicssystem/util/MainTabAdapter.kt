package com.example.smarthydroponicssystem.util

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

import androidx.viewpager2.adapter.FragmentStateAdapter

class MainTabAdapter(fragmentActivity: FragmentActivity):
    FragmentStateAdapter(fragmentActivity) {

    var plantFragmentList = listOf<Fragment>()

    class PlantViewHolder()

    override fun getItemCount(): Int {
        return plantFragmentList.size
    }

    override fun createFragment(position: Int): Fragment {

        return plantFragmentList[position]
    }
}