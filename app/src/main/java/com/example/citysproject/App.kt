package com.example.citysproject

import android.app.Application
import androidx.room.Room
import com.example.citysproject.data.local.AppDatabase

class App : Application() {
    companion object {
        private lateinit var db: AppDatabase
        fun getDatabase(): AppDatabase =
            db
    }

    override fun onCreate() {
        super.onCreate()
        db = Room
                .databaseBuilder(applicationContext, AppDatabase::class.java, "City_db")
                .allowMainThreadQueries()
                .build()
    }
}