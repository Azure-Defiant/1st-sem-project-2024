package com.project.proctorly

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Question : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_question)

            val studentbutton = findViewById<Button>(R.id.studentbtn)

            studentbutton.setOnClickListener {
                val intent = Intent(this, StudentDashboard::class.java)
                startActivity(intent)






            }

    }
}
