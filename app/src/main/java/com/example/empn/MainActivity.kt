package com.example.empn

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


lateinit var btnSixWeekCourses: Button
lateinit var btnSixMonthCourses:Button
lateinit var imageView: ImageView
lateinit var ContactButton: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ContactButton =findViewById(R.id.ContactButton)
        btnSixWeekCourses = findViewById(R.id.btnSixWeekCourses)
        btnSixMonthCourses = findViewById(R.id.btnSixMonthCourses)
        imageView=findViewById(R.id.imageView)

        btnSixWeekCourses.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    `weekActivity`::class.java
                )
            )
        }
        btnSixMonthCourses.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    SixmonthActivity::class.java
                )
            )
        }
        ContactButton.setOnClickListener { startActivity(Intent(this,ContactAbout::class.java))}
    }
}

