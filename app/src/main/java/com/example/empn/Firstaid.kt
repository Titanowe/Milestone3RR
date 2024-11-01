package com.example.empn

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

lateinit var Sew:Button
lateinit var Landsca:Button
lateinit var lifeski:Button
class Firstaid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_firstaid)

        Sew=findViewById(R.id.Sew)
        Landsca=findViewById(R.id.LandSca)
        lifeski=findViewById(R.id.lifeski)

        Sew.setOnClickListener { startActivity((Intent( this,Sewing ::class.java))) }
        Landsca.setOnClickListener { startActivity((Intent( this,landscaping ::class.java))) }
        FirstaidButton.setOnClickListener { startActivity((Intent( this,Firstaid ::class.java))) }
        lifeski.setOnClickListener { startActivity((Intent( this,Lifeskills ::class.java))) }
    }
}