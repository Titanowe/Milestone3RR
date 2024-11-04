package com.example.empn

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
lateinit var child_Minding_Button1:Button
lateinit var Garden_Mat_Button2:Button
lateinit var btnSixMonthCourses3:Button
lateinit var Join_Us_Button2:Button
class cooking : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cooking)

        child_Minding_Button1=findViewById(R.id.child_Minding_Button1)
        Garden_Mat_Button2=findViewById(R.id.Garden_Mat_Button2)
        btnSixMonthCourses3=findViewById(R.id.btnSixMonthCourses3)
        Join_Us_Button2=findViewById(R.id.Join_Us_Button2)

        child_Minding_Button1.setOnClickListener { startActivity(Intent(this,childminding::class.java)) }
        Garden_Mat_Button2.setOnClickListener { startActivity(Intent(this,Garden_Matenance::class.java)) }
        btnSixMonthCourses3.setOnClickListener { startActivity(Intent(this,SixmonthActivity::class.java)) }
        Join_Us_Button2.setOnClickListener { startActivity(Intent(this,signup::class.java)) }
    }
}