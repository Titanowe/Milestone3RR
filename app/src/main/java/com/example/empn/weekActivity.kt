package com.example.empn

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
lateinit var Cookingc:ImageButton
lateinit var Garden:ImageButton
lateinit var Child:ImageButton


class `weekActivity` : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sixweek)

        Cookingc=findViewById(R.id.Cookingc)
        Garden=findViewById(R.id.Garden)
        Child=findViewById(R.id.Child)

        Cookingc.setOnClickListener { startActivity(Intent(this,cooking::class.java)) }
        Garden.setOnClickListener { startActivity(Intent(this,Garden_Matenance::class.java)) }
        Child.setOnClickListener { startActivity(Intent(this,childminding::class.java))}



        }
    }
