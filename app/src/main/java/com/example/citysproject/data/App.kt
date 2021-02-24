package com.example.citysproject.data

import android.app.Application

class App : Application() {
    companion object {
        private lateinit var db: AppDatabase
        fun getDatabase(): AppDatabase = db
    }
}
