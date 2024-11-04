package com.example.empn

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

lateinit var Garden_Mat_Button1:Button
lateinit var cookingButton1:Button
lateinit var Join_Us_Button1:Button

class childminding : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        Garden_Mat_Button1=findViewById(R.id.Garden_Mat_Button1)
        cookingButton1=findViewById(R.id.cookingButton1)
        Join_Us_Button1=findViewById(R.id.Join_Us_Button1)

        setContentView(R.layout.activity_childminding)

        cookingButton1.setOnClickListener { startActivity(Intent(this,cooking::class.java)) }
        Garden_Mat_Button1.setOnClickListener { startActivity(Intent(this,Garden_Matenance::class.java)) }
        Join_Us_Button1.setOnClickListener { startActivity(Intent(this,signup::class.java)) }
    }
}