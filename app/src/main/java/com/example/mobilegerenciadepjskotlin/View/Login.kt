package com.example.mobilegerenciadepjskotlin.View

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mobilegerenciadepjskotlin.R
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        /*idEsqueceu.setOnClickListener(){
            val intent = Intent(this@Login, EsqueceuSenhaActivity::class.java)
            startActivity(intent)
        }*/

        btnLogin.setOnClickListener(){
            var intent2 = Intent(this@Login, TecnologiasActivity::class.java)
            startActivity(intent2)
        }



    }
}