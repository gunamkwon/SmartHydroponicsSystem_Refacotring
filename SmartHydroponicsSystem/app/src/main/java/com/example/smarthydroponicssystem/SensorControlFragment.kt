package com.example.smarthydroponicssystem

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.smarthydroponicssystem.databinding.FragmentSensorControlBinding

class SensorControlFragment: Fragment() {

    private lateinit var binding: FragmentSensorControlBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSensorControlBinding.inflate(inflater, container, false)

        // TODO: SharedPreferences 사용하기
        
        return binding.root
    }
}