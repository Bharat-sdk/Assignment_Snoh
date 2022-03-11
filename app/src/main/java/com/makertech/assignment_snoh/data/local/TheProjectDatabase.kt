package com.makertech.assignment_snoh.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.makertech.assignment_snoh.data.local.entities.TheProject

@Database(
    entities = [TheProject::class],
    version = 1
)
abstract class TheProjectDatabase :RoomDatabase() {
    abstract fun projectDao():TheProjectDao
}