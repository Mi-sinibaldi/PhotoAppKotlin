package com.example.photoappkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {

    lateinit var editTextUserName : EditText
    lateinit var editTextEmail : EditText
    lateinit var editTextPassword : EditText
    lateinit var buttonRegister : Button
    lateinit var textViewAccount : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        editTextUserName = findViewById(R.id.editTextUserName)
        editTextEmail = findViewById(R.id.editTextEmail)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonRegister = findViewById(R.id.buttonRegister)
        textViewAccount = findViewById(R.id.textViewAccount)

        buttonRegister.setOnClickListener{
            val intent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}
