package com.example.mobilegerenciadepjskotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.mobilegerenciadepjskotlin.View.Login

class MainActivity : AppCompatActivity() {

    private var mDelayHandler : Handler? = null
    private val SPLASH_DELAY: Long = 2500

    internal val mRunnable: Runnable = Runnable {
        if (!isFinishing){
            val intent = Intent(applicationContext, Login::class.java)
            startActivity(intent)
            finish()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mDelayHandler = Handler()

        mDelayHandler!!.postDelayed(mRunnable, SPLASH_DELAY)
    }

    public override fun onDestroy() {
        if (mDelayHandler != null){
            mDelayHandler!!.removeCallbacks(mRunnable)
        }

        super.onDestroy()
    }
}
