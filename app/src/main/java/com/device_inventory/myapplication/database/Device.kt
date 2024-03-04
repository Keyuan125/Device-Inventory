package com.device_inventory.myapplication.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Device(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val pictures: String, // Storing image paths; consider a better approach for actual images
    val serialNumber: String,
    val macNumber: String
)
