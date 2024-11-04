package com.example.empn

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
private lateinit var totalFeesTextView: TextView
private lateinit var firstAid_checkBox: CheckBox
private lateinit var Landscaping_checkBox: CheckBox
private lateinit var Life_skills_checkBox: CheckBox
private lateinit var Sewing_checkBox: CheckBox
private lateinit var Cooking_checkBox: CheckBox
private lateinit var child_Minding_checkBox: CheckBox
private lateinit var Garden_Maintenance_checkBox: CheckBox

class CalculatActivityt : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calculat_activityt)

        totalFeesTextView = findViewById(R.id.totalFees)
        firstAid_checkBox= findViewById(R.id.firstAid_checkBox)
        Landscaping_checkBox = findViewById(R.id.Landscaping_checkBox)
        Life_skills_checkBox = findViewById(R.id.Life_skills_checkBox)
        Sewing_checkBox = findViewById(R.id.Sewing_checkBox)
        Cooking_checkBox = findViewById(R.id.Cooking_checkBox)
        child_Minding_checkBox = findViewById(R.id.child_Minding_checkBox)
        Garden_Maintenance_checkBox = findViewById(R.id.Garden_Maintenance_checkBox)

        val calculateButton: Button = findViewById(R.id.calculateButton)
        calculateButton.setOnClickListener { calculateFees() }
    }
    private fun calculateFees() {
        var total = 0.0

        // Sum the fees for selected courses
        if (firstAid_checkBox.isChecked) total += 1500
        if (Landscaping_checkBox.isChecked) total += 1500
        if (Life_skills_checkBox.isChecked) total += 1500
        if (Sewing_checkBox.isChecked) total += 1500
        if (Cooking_checkBox.isChecked) total += 750
        if (child_Minding_checkBox.isChecked) total += 750
        if (Garden_Maintenance_checkBox.isChecked) total += 750

        //  discount(10%)
        val discount = total * 0.10
        total -= discount

        //  VAT (15%)
        val vat = total * 0.15
        total += vat

        totalFeesTextView.text = "Total Fees: $${"%.2f".format(total)}"



    }
}