package com.example.bancoitau

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvList: RecyclerView
    private var adapter = MenuItemAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        setItemsList()
    }

    private fun initViews() {
        rvList = findViewById(R.id.rv_list)
        rvList.adapter = adapter
        rvList.layoutManager = GridLayoutManager(this, 2)
    }

    private fun setItemsList() {
        adapter.setItemsList(
            arrayListOf(
                MenuItemModel(
                       "Cartões"
                ),
                MenuItemModel(
                    "Meus comprovantes"
                ),
                MenuItemModel(
                    "Portabilidade de salário"
                )
            )
        )
    }
}