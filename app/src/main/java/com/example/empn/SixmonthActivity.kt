package com.example.empn


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

lateinit var First_Aid_ImageButton :ImageButton
lateinit var Life_skills_ImageButton: ImageButton
lateinit var Landscaping_ImageButton:ImageButton
lateinit var Sewing_ImageButton: ImageButton
lateinit var btnSixWeekCourses0:Button

class SixmonthActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sixmonth)

        First_Aid_ImageButton = findViewById(R.id.First_Aid_ImageButton)
        btnSixWeekCourses0=findViewById(R.id.btnSixWeekCourses0)
        Life_skills_ImageButton = findViewById(R.id.Life_skills_ImageButton)
        Landscaping_ImageButton =findViewById(R.id.Landscaping_ImageButton)
        Sewing_ImageButton=findViewById(R.id.Sewing_ImageButton)

        btnSixWeekCourses0.setOnClickListener { startActivity(Intent(this,weekActivity::class.java)) }
        First_Aid_ImageButton.setOnClickListener { startActivity(Intent( this,Firstaid ::class.java))}
        Life_skills_ImageButton.setOnClickListener { startActivity (Intent(this, Lifeskills::class.java))}
        Landscaping_ImageButton.setOnClickListener { startActivity(Intent(this,landscaping::class.java))}
        Sewing_ImageButton.setOnClickListener { startActivity(Intent(this,Sewing::class.java))}
    }
}