package com.example.empn

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


lateinit var Join_Us_Button:Button
class ContactAbout : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contact_about)

        Join_Us_Button=findViewById(R.id.Join_Us_Button)


        Join_Us_Button.setOnClickListener { startActivity(Intent(this,signup::class.java)) }
    }
}