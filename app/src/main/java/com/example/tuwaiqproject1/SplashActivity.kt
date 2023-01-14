package com.example.tuwaiqproject1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.math.log

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()
        val hello = findViewById<ConstraintLayout>(R.id.ss)
        hello.setOnLongClickListener {
            val i = Intent(applicationContext, LoginActivity::class.java)
            startActivity(i)
            true
        }
    }
}