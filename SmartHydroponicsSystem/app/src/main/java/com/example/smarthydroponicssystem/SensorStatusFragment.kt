package com.example.smarthydroponicssystem

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.example.smarthydroponicssystem.databinding.FragmentControlSystemBinding
import com.example.smarthydroponicssystem.databinding.FragmentSensorStatusBinding
import com.example.smarthydroponicssystem.databinding.SensorStatusItemBinding

class SensorStatusFragment: Fragment() {

    private lateinit var binding: FragmentSensorStatusBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSensorStatusBinding.inflate(layoutInflater, container, false)


        bindTdsSensorView()
        bindWaterSensorView()

        return binding.root
    }


    private fun bindTdsSensorView() {

        binding.tdsSensorStatus.btnStatusDetail.setOnClickListener {

        }
    }

    private fun bindWaterSensorView() {

        binding.waterSensorStatus.btnStatusDetail.setOnClickListener {

            binding.waterSensorStatus.itemCardView.addView(createDetailInfo())
        }
    }

    private fun createDetailInfo(): View? {
/*
        val constraintLayout = ConstraintLayout(requireContext()). apply {
            //layoutParams = ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.)
        }
*/
        return null
    }

}