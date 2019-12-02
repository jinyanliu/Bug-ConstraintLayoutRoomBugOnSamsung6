package com.example.testConstraintLayoutOnSamsung6

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Category::class], version = 1, exportSchema = false)
internal abstract class MyDatabase : RoomDatabase() {
    abstract fun categoriesDao(): MyDao
}