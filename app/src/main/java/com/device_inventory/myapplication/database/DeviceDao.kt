package com.device_inventory.myapplication.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DeviceDao {
    @Insert
    suspend fun insert(device: Device)

    @Query("SELECT * FROM device")
    fun getAllDevices(): LiveData<List<Device>>
}
