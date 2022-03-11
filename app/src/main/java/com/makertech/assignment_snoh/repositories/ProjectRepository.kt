package com.makertech.assignment_snoh.repositories

import androidx.lifecycle.LiveData
import com.makertech.assignment_snoh.data.local.TheProjectDao
import com.makertech.assignment_snoh.data.local.entities.TheProject
import javax.inject.Inject

class ProjectRepository @Inject constructor(

    private val projectDao: TheProjectDao
) {

    suspend fun insertData(data :TheProject){
        projectDao.insertData(data)
    }

    suspend fun getAllData():LiveData<List<TheProject>>
    {
        return projectDao.getAllData()
    }


}