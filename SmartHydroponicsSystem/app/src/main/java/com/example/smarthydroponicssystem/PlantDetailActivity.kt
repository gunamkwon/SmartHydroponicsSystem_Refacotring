package com.example.smarthydroponicssystem

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import com.example.smarthydroponicssystem.model.Plant

class PlantDetailActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("PlantDetailActivity", "${intent.getParcelableExtra<Plant>("item")?.name}")
    }
}