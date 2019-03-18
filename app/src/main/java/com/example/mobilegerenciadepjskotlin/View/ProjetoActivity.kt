package com.example.mobilegerenciadepjskotlin.View

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.example.mobilegerenciadepjskotlin.R
import com.example.mobilegerenciadepjskotlin.adapter.ProjetoAdapter
import kotlinx.android.synthetic.main.activity_projeto.*

class ProjetoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projeto)

        recycle_proj.layoutManager = LinearLayoutManager(this)
        recycle_proj.adapter = ProjetoAdapter()
    }
}
