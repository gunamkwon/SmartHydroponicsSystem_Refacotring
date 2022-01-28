package com.example.smarthydroponicssystem

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.fragment.app.Fragment
import com.example.smarthydroponicssystem.databinding.FragmentSensorStatusBinding

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
            binding.tdsSensorStatus.layoutAddItem.addView(createDetailInfo())
        }
    }

    private fun bindWaterSensorView() {

        binding.waterSensorStatus.btnStatusDetail.setOnClickListener {

            val set = ConstraintSet()
            val text = TextView(context).apply {
                id = View.generateViewId()
                text = "Hello World"
                setTextColor(Color.WHITE)
            }
            binding.waterSensorStatus.layoutAddItem.addView(text)
            set.clone(binding.waterSensorStatus.layoutAddItem)
            set.apply {
                connect(text.id, ConstraintSet.TOP, binding.waterSensorStatus.layoutAddItem.id, ConstraintSet.TOP)
                connect(text.id, ConstraintSet.START, binding.waterSensorStatus.layoutAddItem.id, ConstraintSet.START)
            }
        }
    }

    private fun createDetailInfo(): View? {

        val constraintLayout = ConstraintLayout(requireContext()).apply {
            layoutParams = ConstraintLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        }

        return LayoutInflater.from(context)
            .inflate(R.layout.support_simple_spinner_dropdown_item, binding.root, false)
    }

}