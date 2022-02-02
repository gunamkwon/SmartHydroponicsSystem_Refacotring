package com.example.smarthydroponicssystem

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.smarthydroponicssystem.databinding.FragmentPlantBinding
import com.example.smarthydroponicssystem.model.Plant
import com.example.smarthydroponicssystem.util.PlantAdapter

class PlantFragment: Fragment() {

    private lateinit var binding: FragmentPlantBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPlantBinding.inflate(inflater, container, false)

        initRecyclerView()

        return binding.root
    }

    private fun initRecyclerView() {
        val adapter = PlantAdapter(requireContext())
        binding.plantRecyclerView.apply {
            adapter.apply {
                val list = listOf(
                    Plant("상추", R.drawable.ic_launcher_background, "", 0, 100),
                    Plant("배추", R.drawable.ic_launcher_background,"", 0, 100),
                    Plant("딸기", R.drawable.ic_launcher_background,"", 0, 100))
                this.plantList.addAll(list)
            }

            this.adapter = adapter
            this.layoutManager = LinearLayoutManager(context)
            this.setHasFixedSize(true)
        }
    }
}