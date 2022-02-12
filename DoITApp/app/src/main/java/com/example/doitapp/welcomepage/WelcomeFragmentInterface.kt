package com.example.doitapp.welcomepage

interface WelcomeFragmentInterface {
    fun checkLogin(username: String, password: String)
    fun registerPage()
    fun loginPage()
    fun registerUser(username: String, password: String, phone: String)
}