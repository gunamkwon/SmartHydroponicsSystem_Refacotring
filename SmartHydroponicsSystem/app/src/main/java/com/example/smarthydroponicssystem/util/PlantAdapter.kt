package com.example.smarthydroponicssystem.util

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.smarthydroponicssystem.databinding.ItemPlantBinding
import com.example.smarthydroponicssystem.model.Plant


class PlantAdapter: RecyclerView.Adapter<PlantAdapter.PlantViewHolder>() {

    val plantList = mutableListOf<Plant>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantViewHolder {
        return PlantViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: PlantViewHolder, position: Int) {
        val item = plantList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return plantList.size
    }


    class PlantViewHolder private constructor(val binding: ItemPlantBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Plant) {
            binding.plantCardImage.setImageResource(item.image)
            binding.plantText.text = item.name
        }

        companion object {
            fun from(parent: ViewGroup): PlantViewHolder {
                val binding = ItemPlantBinding.inflate(LayoutInflater.from(parent.context))
                return PlantViewHolder(binding)
            }
        }
    }
}