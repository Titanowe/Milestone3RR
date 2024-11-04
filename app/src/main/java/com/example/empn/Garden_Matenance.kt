package com.example.empn

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

lateinit var btnSixMonthCourses2:Button
lateinit var child_Minding_Button2:Button
lateinit var cooking_Button1:Button
lateinit var Join_Us_Button4:Button
class Garden_Matenance : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_garden_matenance)
        child_Minding_Button2=findViewById(R.id.child_Minding_Button2)
        cooking_Button1=findViewById(R.id.cooking_Button1)
        btnSixMonthCourses2=findViewById(R.id.btnSixMonthCourses2)
        Join_Us_Button4=findViewById(R.id.Join_Us_Button4)

        child_Minding_Button2.setOnClickListener { startActivity((Intent( this,childminding ::class.java))) }
        btnSixMonthCourses2.setOnClickListener { startActivity((Intent(this,SixmonthActivity::class.java))) }
        Join_Us_Button4.setOnClickListener { startActivity(Intent(this,signup::class.java)) }
        btnSixMonthCourses2.setOnClickListener { startActivity(Intent(this,SixmonthActivity::class.java)) }


    }
}