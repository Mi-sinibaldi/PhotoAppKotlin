package com.example.photoappkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    lateinit var buttonLogin : Button
    lateinit var textViewNewAccount : TextView
    lateinit var textViewForgetPassword : TextView
    lateinit var editTextLogin : EditText
    lateinit var editTextPassword : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        buttonLogin = findViewById(R.id.buttonLogin)
        textViewNewAccount = findViewById(R.id.textViewNewAccount)
        textViewForgetPassword = findViewById(R.id.textViewForgetPassword)
        editTextLogin = findViewById(R.id.editTextLogin)
        editTextPassword = findViewById(R.id.editTextPassword)

        textViewNewAccount.setOnClickListener{
            val intent = Intent(applicationContext,RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
