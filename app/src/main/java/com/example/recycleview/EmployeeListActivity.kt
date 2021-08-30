package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EmployeeListActivity : AppCompatActivity() {
    lateinit var employeeListView :RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.employee_layout)
        employeeListView = findViewById(R.id.employee_list)
        val employeeaAdapter = EmpployeeListAdapter(getEmlpoyeeList())
        employeeListView.adapter = employeeaAdapter
        var gridview = GridLayoutManager(this,3)
        employeeListView.layoutManager =gridview
    }
    fun getEmlpoyeeList():ArrayList<String>{
        val list = ArrayList<String>()
        for(i in 1..40){
            list.add("Employee $i")
        }
        return list;
    }
}