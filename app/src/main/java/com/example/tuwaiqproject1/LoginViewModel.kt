package com.example.tuwaiqproject1

import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel() {
    private val name = "Mohammed"
    private val password = 5

    fun checkName(string: String) = name == string

    fun checkPassword(string: String) = string.length == password


}