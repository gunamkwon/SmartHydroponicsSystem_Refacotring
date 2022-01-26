package com.example.smarthydroponicssystem.model

data class Plant(
    val name: String,
    val image: Int,
    val information: String,
    val minTDS: Int,
    val maxTDS: Int
)
