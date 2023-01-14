package com.example.tuwaiqproject1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModelProvider


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()
        val viewModel = ViewModelProvider(this)[LoginViewModel::class.java]
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val login = findViewById<Button>(R.id.hello)
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        login.setOnClickListener {
            imm.hideSoftInputFromWindow(it.windowToken, 0)
            if (viewModel.checkName(username.text.toString()) && viewModel.checkPassword(password.text.toString())) {
                val intent = Intent(applicationContext, MainActivity::class.java)
                intent.putExtra("username", username.text.toString())
                startActivity(intent)
            }
            else Toast.makeText(
                applicationContext,
                "Username or password is incorrect",
                Toast.LENGTH_SHORT
            ).show()
        }
        username.setOnClickListener {
            imm.hideSoftInputFromWindow(it.windowToken, 0)
        }
        password.setOnClickListener {
            imm.hideSoftInputFromWindow(it.windowToken, 0)
        }
        toolbar.setNavigationOnClickListener{
            finish()
        }


    }
}