package com.example.empn


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
@SuppressLint("StaticFieldLeak")
lateinit var Landscaping_Button3:Button
lateinit var First_Aid_Button3:Button
lateinit var Life_skills_Button3:Button
lateinit var btnSixWeek_Courses6:Button
lateinit var Join_Us_Button7:Button

class Sewing : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sewing)

        Landscaping_Button3=findViewById(R.id.Landscaping_Button3)
        First_Aid_Button3=findViewById(R.id.First_Aid_Button3)
        Life_skills_Button3=findViewById(R.id.Life_skills_Button3)
        btnSixWeek_Courses6=findViewById(R.id.btnSixWeek_Courses6)
        Join_Us_Button7=findViewById(R.id.Join_Us_Button7)

        First_Aid_Button3.setOnClickListener { startActivity(Intent(this,Firstaid::class.java)) }
        btnSixWeek_Courses6.setOnClickListener { startActivity(Intent(this,weekActivity::class.java)) }
        Life_skills_Button3.setOnClickListener { startActivity(Intent(this,Lifeskills::class.java)) }
        Landscaping_Button3.setOnClickListener { startActivity(Intent(this,landscaping::class.java)) }
        Join_Us_Button7.setOnClickListener { startActivity(Intent(this,signup::class.java)) }



    }
}