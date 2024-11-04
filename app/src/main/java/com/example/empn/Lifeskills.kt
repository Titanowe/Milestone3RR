package com.example.empn

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

lateinit var First_Aid_Button2:Button
lateinit var Landscaping_Button2:Button
lateinit var Sewing_Button3:Button
lateinit var btnSixWeek_Courses4:Button
lateinit var Join_Us_Button6:Button

class Lifeskills : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lifeskills)

        First_Aid_Button2=findViewById(R.id.First_Aid_Button2)
        Landscaping_Button2=findViewById(R.id.Landscaping_Button2)
        Sewing_Button3=findViewById(R.id.Sewing_Button3)
        btnSixWeek_Courses4=findViewById(R.id.btnSixWeek_Courses4)
        Join_Us_Button6=findViewById(R.id.Join_Us_Button6)

        First_Aid_Button2.setOnClickListener { startActivity(Intent(this,Firstaid::class.java)) }
        Landscaping_Button2.setOnClickListener { startActivity(Intent(this,landscaping::class.java)) }
        Sewing_Button3.setOnClickListener { startActivity(Intent(this,Sewing::class.java)) }
        btnSixWeek_Courses4.setOnClickListener { startActivity(Intent(this,weekActivity::class.java)) }
        Join_Us_Button6.setOnClickListener { startActivity(Intent(this,signup::class.java)) }
    }
}