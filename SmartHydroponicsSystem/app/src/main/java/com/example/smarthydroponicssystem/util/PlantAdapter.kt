package com.example.smarthydroponicssystem.util

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.smarthydroponicssystem.PlantDetailActivity
import com.example.smarthydroponicssystem.databinding.ItemPlantBinding
import com.example.smarthydroponicssystem.model.Plant


class PlantAdapter(context: Context): RecyclerView.Adapter<PlantAdapter.PlantViewHolder>() {

    val mContext: Context = context
    val plantList = mutableListOf<Plant>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantViewHolder {
        return PlantViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: PlantViewHolder, position: Int) {
        val item = plantList[position]
        holder.bind(item, mContext)
    }

    override fun getItemCount(): Int {
        return plantList.size
    }


    class PlantViewHolder private constructor(val binding: ItemPlantBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Plant, context: Context) {
            binding.plantCardImage.setImageResource(item.image)
            binding.plantText.text = item.name

            itemView.setOnClickListener {
                Intent(context, PlantDetailActivity::class.java).apply {
                    putExtra("item", item)
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }.run {context.startActivity(this)}
            }
        }

        companion object {
            fun from(parent: ViewGroup): PlantViewHolder {
                val binding = ItemPlantBinding.inflate(LayoutInflater.from(parent.context),parent,false)
                return PlantViewHolder(binding)
            }
        }
    }
}