package com.example.citysproject.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.citysproject.data.model.City

@Database(entities = [City::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
    abstract fun CityDao(): CityDao
}