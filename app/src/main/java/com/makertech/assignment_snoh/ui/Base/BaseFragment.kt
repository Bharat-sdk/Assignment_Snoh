package com.makertech.assignment_snoh.ui.Base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment <VBinding: ViewBinding>(layout_id:Int,
private val bindingInflater: (inflater: LayoutInflater) ->VBinding):Fragment(layout_id){
    private var _binding : VBinding? = null

    val binding :VBinding
        get() = _binding as VBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = bindingInflater.invoke(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        observe()
    }

    open fun initViews(){}
    open fun observe(){}


}