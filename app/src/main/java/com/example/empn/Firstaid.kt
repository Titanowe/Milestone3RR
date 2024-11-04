package com.example.empn

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

lateinit var Sewing_Button1:Button
lateinit var Landscaping_Button1:Button
lateinit var Life_skills_Button1:Button
lateinit var btnSixWeek_Courses2:Button
lateinit var Join_Us_Button3:Button

class Firstaid : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_firstaid)

        Sewing_Button1=findViewById(R.id.Sewing_Button1)
        Landscaping_Button1=findViewById(R.id.Landscaping_Button1)
        Life_skills_Button1=findViewById(R.id.Life_skills_Button1)
        btnSixWeek_Courses2=findViewById(R.id.btnSixWeek_Courses2)
        Join_Us_Button3=findViewById(R.id.Join_Us_Button3)

        Sewing_Button1.setOnClickListener { startActivity((Intent( this,Sewing ::class.java))) }
        Landscaping_Button1.setOnClickListener { startActivity((Intent( this,landscaping ::class.java))) }
        Life_skills_Button1.setOnClickListener { startActivity((Intent( this,Lifeskills ::class.java))) }
        btnSixWeek_Courses2.setOnClickListener { startActivity(Intent(this,weekActivity::class.java)) }
        Join_Us_Button3.setOnClickListener { startActivity(Intent(this,signup::class.java)) }
    }
}