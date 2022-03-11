package com.makertech.assignment_snoh.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.makertech.assignment_snoh.R
import com.makertech.assignment_snoh.adapters.DataAdapter
import com.makertech.assignment_snoh.data.local.entities.TheProject
import com.makertech.assignment_snoh.databinding.FragmentHomeBinding
import com.makertech.assignment_snoh.ui.Base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import java.util.UUID.randomUUID

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home,FragmentHomeBinding::inflate) {
    private val viewModel : HomeViewModel by viewModels()
    lateinit var adapter:DataAdapter

    override fun initViews() {
        super.initViews()
        viewModel.getAllData()
        binding.btnAddData.setOnClickListener {
            viewModel.insertData(TheProject((0..100000000).random().toLong(), randomUUID().toString()))
        }


    }

    override fun observe() {
        super.observe()
        viewModel.data.observe(viewLifecycleOwner, Observer { result->
            adapter = DataAdapter(result as ArrayList<TheProject>)
            binding.homeRecyclerView.layoutManager = LinearLayoutManager(context)
            binding.homeRecyclerView.adapter = adapter
        })
    }

}