package com.makertech.assignment_snoh.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.makertech.assignment_snoh.data.local.entities.TheProject
import com.makertech.assignment_snoh.databinding.ItemDataBinding

class DataAdapter(val data: ArrayList<TheProject>):
        RecyclerView.Adapter<DataAdapter.MyViewHolder>() {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val binding = ItemDataBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return MyViewHolder(binding)
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            with(holder){
                with(data[position]){
                    binding.itemTxt.text = this.anything
                }
            }
        }

        override fun getItemCount(): Int {
            return data.size
        }



        inner class MyViewHolder(val binding: ItemDataBinding): RecyclerView.ViewHolder(binding.root)



    }
