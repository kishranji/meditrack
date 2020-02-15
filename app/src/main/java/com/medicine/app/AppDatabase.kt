package com.medicine.app

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [medicine_entity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao(): medicine_duo?
}