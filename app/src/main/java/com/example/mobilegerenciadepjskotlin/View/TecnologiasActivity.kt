package com.example.mobilegerenciadepjskotlin.View

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.StaggeredGridLayoutManager
import com.example.mobilegerenciadepjskotlin.R
import com.example.mobilegerenciadepjskotlin.adapter.TecnologiaAdapter
import com.example.mobilegerenciadepjskotlin.model.Tecnologia
import kotlinx.android.synthetic.main.activity_tecnologias.*

class TecnologiasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tecnologias)

        //recycleview_main.setBackgroundColor(Color.WHITE)
        recycleview_main.layoutManager = LinearLayoutManager(this)
        recycleview_main.adapter = TecnologiaAdapter()
    

    }
}