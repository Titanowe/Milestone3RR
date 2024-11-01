package com.example.empn


import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

lateinit var First :ImageButton
lateinit var Life: ImageButton
lateinit var Landscaping:ImageButton
lateinit var SewingB: ImageButton

class SixmonthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sixmonth)

        First = findViewById(R.id.First)
        Life = findViewById(R.id.Life)
        Landscaping =findViewById(R.id.Landscaping)
        SewingB=findViewById(R.id.SewingB)

        First.setOnClickListener { startActivity(Intent( this,Firstaid ::class.java))}
        Life.setOnClickListener { startActivity (Intent(this, Lifeskills::class.java))}
        Landscaping.setOnClickListener { startActivity(Intent(this,landscaping::class.java))}
        SewingB.setOnClickListener { startActivity(Intent(this,Sewing::class.java))}
    }
}