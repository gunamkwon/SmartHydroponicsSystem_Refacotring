package com.example.smarthydroponicssystem.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Plant(
    val name: String,
    val image: Int,
    val information: String,
    val minTDS: Int,
    val maxTDS: Int
): Parcelable
