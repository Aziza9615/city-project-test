package com.example.citysproject.data.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "city")
data class City(
    @PrimaryKey(autoGenerate = false)
    @NonNull
    var name: String,
    var country: String? = null,
    var subRegion: String? = null,
    var capital: String? = null,
    var area: String?  = null,
    var flag: String? = null
)
