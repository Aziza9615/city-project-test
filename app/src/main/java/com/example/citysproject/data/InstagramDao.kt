package com.example.citysproject.data

import androidx.room.*
import com.example.citysproject.model.City

@Dao
interface InstagramDao {
    @Insert(onConflict = OnConflictStrategy. IGNORE)
    fun InsertPublications(data: List<City>?)

    @Query("SELECT * FROM city")
    fun fetchFavorites(): List<City>

}