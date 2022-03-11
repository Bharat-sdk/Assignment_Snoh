package com.makertech.assignment_snoh.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.makertech.assignment_snoh.data.local.entities.TheProject

@Dao
interface TheProjectDao {

    @Query("SELECT * from yes_thats_me")
     fun getAllData():LiveData<List<TheProject>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertData(data : TheProject)
}