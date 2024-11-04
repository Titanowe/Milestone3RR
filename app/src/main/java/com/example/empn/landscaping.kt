package com.example.empn


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
lateinit var  First_Aid_Button1: Button
lateinit var Sewing_Button2:Button
lateinit var Life_skills_Button2:Button
lateinit var btnSixWeek_Courses3:Button
lateinit var Join_Us_Button5:Button

class landscaping : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_landscaping)

        First_Aid_Button1=findViewById(R.id.First_Aid_Button1)
        Sewing_Button2=findViewById(R.id.Sewing_Button2)
        Life_skills_Button2=findViewById(R.id.Life_skills_Button2)
        btnSixWeek_Courses3=findViewById(R.id.btnSixWeek_Courses3)
        Join_Us_Button5=findViewById(R.id.Join_Us_Button5)

        First_Aid_Button1.setOnClickListener { startActivity((Intent( this,Firstaid ::class.java))) }
        Sewing_Button2.setOnClickListener { startActivity(Intent(this,Sewing::class.java)) }
        Life_skills_Button2.setOnClickListener { startActivity(Intent(this,Lifeskills::class.java)) }
        btnSixWeek_Courses3.setOnClickListener { startActivity(Intent(this, weekActivity::class.java)) }
        Join_Us_Button5.setOnClickListener { startActivity(Intent(this,signup::class.java)) }
    }
}