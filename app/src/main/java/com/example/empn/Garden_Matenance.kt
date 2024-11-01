package com.example.empn

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


lateinit var child:Button
class Garden_Matenance : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_garden_matenance)
       child=findViewById(R.id.child)

        child.setOnClickListener { startActivity((Intent( this,childminding ::class.java))) }

    }
}