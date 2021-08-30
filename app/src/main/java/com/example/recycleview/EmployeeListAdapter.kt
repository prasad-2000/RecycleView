package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmpployeeListAdapter(val employeeList :ArrayList<String>):RecyclerView.Adapter<EmpployeeListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_view,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = employeeList[position]
        holder.EmployeeName.text = item
    }

    override fun getItemCount(): Int {
        return employeeList.size
    }
    class ViewHolder(itemView : View) :RecyclerView.ViewHolder(itemView){
        val EmployeeName : TextView = itemView.findViewById(R.id.employee_name)

    }
}