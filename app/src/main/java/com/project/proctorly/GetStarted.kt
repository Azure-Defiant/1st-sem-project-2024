package com.project.proctorly

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GetStarted : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.get_started)

        val getstartedbutton = findViewById<Button>(R.id.btngetstarted)

        getstartedbutton.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
//ginskayl
        }

    }
}