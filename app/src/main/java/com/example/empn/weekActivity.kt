package com.example.empn

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
lateinit var Cooking_ImageButton:ImageButton
lateinit var Garden_Mat_ImageButton:ImageButton
lateinit var Child_Minding_ImageButton:ImageButton
lateinit var btnSixMonthCourses0:Button

class `weekActivity` : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sixweek)

        Cooking_ImageButton=findViewById(R.id.Cooking_ImageButton)
        btnSixMonthCourses0=findViewById(R.id.btnSixMonthCourses0)
        Garden_Mat_ImageButton=findViewById(R.id.Garden_Mat_ImageButton)
        Child_Minding_ImageButton=findViewById(R.id.Child_Minding_ImageButton)

        Cooking_ImageButton.setOnClickListener { startActivity(Intent(this,cooking::class.java)) }
        btnSixMonthCourses0.setOnClickListener { startActivity(Intent(this,SixmonthActivity::class.java)) }
        Garden_Mat_ImageButton.setOnClickListener { startActivity(Intent(this,Garden_Matenance::class.java)) }
        Child_Minding_ImageButton.setOnClickListener { startActivity(Intent(this,childminding::class.java))}



        }
    }
