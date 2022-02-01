package com.example.smarthydroponicssystem

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import com.example.smarthydroponicssystem.databinding.ActivityPlantDetailBinding
import com.example.smarthydroponicssystem.model.Plant

class PlantDetailActivity: AppCompatActivity() {

    val binding by lazy {
        ActivityPlantDetailBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        Log.d("PlantDetailActivity", "${intent.getParcelableExtra<Plant>("item")?.name}")

    }
}