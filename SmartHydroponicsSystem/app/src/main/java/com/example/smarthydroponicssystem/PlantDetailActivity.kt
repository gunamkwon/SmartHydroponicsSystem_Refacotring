package com.example.smarthydroponicssystem

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.smarthydroponicssystem.databinding.ActivityPlantDetailBinding
import com.example.smarthydroponicssystem.model.Plant

class PlantDetailActivity: AppCompatActivity() {

    val binding by lazy {
        ActivityPlantDetailBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initViewByIntentData()
    }

    private fun initViewByIntentData() {
        val plantData = intent.getParcelableExtra<Plant>("item")
        Log.d(TAG, "Intent_PlantData: ${plantData}")

        plantData?.let{
            binding.plantName.text = it?.name
            binding.plantBarImage.setImageResource(it.image)
            binding.plantInformation.text = it.information
            binding.plantTdsInfo.text = "${it?.minTDS}mg/L ~ ${it?.maxTDS}mg/L"
        }
    }

    companion object {
        private const val TAG = "PlantDetailActivity"
    }
}