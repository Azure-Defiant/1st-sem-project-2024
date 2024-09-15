package com.project.proctorly

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)


        val signinbutton = findViewById<Button>(R.id.signinbtn)

        signinbutton.setOnClickListener {
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)

        }
    }
}