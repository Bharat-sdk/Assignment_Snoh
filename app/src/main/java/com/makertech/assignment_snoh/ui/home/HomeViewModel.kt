package com.makertech.assignment_snoh.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.makertech.assignment_snoh.data.local.entities.TheProject
import com.makertech.assignment_snoh.other.Response
import com.makertech.assignment_snoh.repositories.ProjectRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: ProjectRepository
) : ViewModel() {
     lateinit var data : LiveData<List<TheProject>>

    fun insertData(data : TheProject) = viewModelScope.launch {
        repository.insertData(data)
    }

    fun getAllData() = viewModelScope.launch {
        data = repository.getAllData()

    }
}