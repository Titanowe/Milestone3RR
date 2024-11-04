package com.example.empn

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


@SuppressLint("StaticFieldLeak")
lateinit var btnSixWeek_Courses1: Button
@SuppressLint("StaticFieldLeak")
lateinit var btnSixMonth_Courses1:Button
@SuppressLint("StaticFieldLeak")
lateinit var imageView: ImageView
@SuppressLint("StaticFieldLeak")
lateinit var Contact_Button1: Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Contact_Button1 =findViewById(R.id.Contact_Button1)
        btnSixWeek_Courses1 = findViewById(R.id.btnSixWeek_Courses1)
        btnSixMonth_Courses1 = findViewById(R.id.btnSixMonth_Courses1)
        imageView=findViewById(R.id.imageView)

        btnSixWeek_Courses1.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    weekActivity::class.java
                )
            )
        }
        btnSixMonth_Courses1.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    SixmonthActivity::class.java
                )
            )
        }
        Contact_Button1.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    ContactAbout::class.java
                )
            )
        }
    }
}

