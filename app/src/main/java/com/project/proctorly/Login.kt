package com.project.proctorly

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)


        val loginbutton = findViewById<Button>(R.id.login)

        loginbutton.setOnClickListener {
            val intent = Intent(this, Question::class.java)
            startActivity(intent)

        }


        val signinbutton = findViewById<Button>(R.id.signinbtn)

        signinbutton.setOnClickListener {
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)

        }
    }
}