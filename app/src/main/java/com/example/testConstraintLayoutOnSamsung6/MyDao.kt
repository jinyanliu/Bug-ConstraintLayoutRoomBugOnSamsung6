package com.example.testConstraintLayoutOnSamsung6

import androidx.room.Dao
import androidx.room.Query

@Dao
internal interface MyDao {
    @Query("SELECT * FROM categories")
    suspend fun getAll(): List<Category>
}