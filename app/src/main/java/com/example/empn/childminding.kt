package com.example.empn

import android.content.Intent
import android.os.Bundle
import android.widget.Button

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

lateinit var Gardenm:Button
lateinit var cookingButton:Button

class childminding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        Gardenm=findViewById(R.id.Gardenm)
        cookingButton=findViewById(R.id.cookingButton)
        setContentView(R.layout.activity_childminding)
        cookingButton.setOnClickListener { startActivity(Intent(this,cooking::class.java)) }
        Gardenm.setOnClickListener { startActivity(Intent(this,Garden_Matenance::class.java)) }
    }
}