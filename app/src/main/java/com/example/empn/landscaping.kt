package com.example.empn


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
lateinit var  FirstaidButton: Button



class landscaping : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_landscaping)
        FirstaidButton=findViewById(R.id.FirstaidButton)
        FirstaidButton.setOnClickListener { startActivity((Intent( this,Firstaid ::class.java))) }
    }
}