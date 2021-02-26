package com.example.citysproject.data.local

import androidx.room.*
import com.example.citysproject.data.model.City

@Dao
interface CityDao {
    @Insert(onConflict = OnConflictStrategy. IGNORE)
    fun InsertPublications(data: List<City>?)

    @Query("SELECT * FROM city")
    fun fetchFavorites(): List<City>

}