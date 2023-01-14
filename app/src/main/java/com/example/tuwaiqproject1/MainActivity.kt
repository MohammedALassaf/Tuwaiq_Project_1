package com.example.tuwaiqproject1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.google.android.material.navigation.NavigationBarItemView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar2)
        val name = findViewById<TextView>(R.id.name)
        val user = intent.getStringExtra("username")
        name.text = user
        Log.i("TAG" , user.toString())
        toolbar.setNavigationOnClickListener{
            finish()
        }


    }
}