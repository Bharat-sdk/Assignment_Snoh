package com.makertech.assignment_snoh.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "yes_thats_me")
data class TheProject(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val code: Long, // Id which will be used to access the data
    @ColumnInfo(name = "logic")
    val anything: String
)
