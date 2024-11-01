package com.example.empn

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

lateinit var Fees:Button
lateinit var Become:Button
class ContactAbout : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contact_about)
        Become=findViewById(R.id.Become)
        Fees=findViewById(R.id.Fees)
        Become.setOnClickListener { startActivity(Intent(this,signup::class.java)) }
        Fees.setOnClickListener { startActivity(Intent(this,CalculatActivityt::class.java)) }
    }
}