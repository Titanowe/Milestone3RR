package com.example.empn

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
private lateinit var totalFeesTextView: TextView
private lateinit var firstAid: CheckBox
private lateinit var landscapingl: CheckBox
private lateinit var lifeSkill: CheckBox
private lateinit var sewing: CheckBox
private lateinit var cookingc: CheckBox
private lateinit var childMinding: CheckBox
private lateinit var gardenMaintenance: CheckBox

class CalculatActivityt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calculat_activityt)

        totalFeesTextView = findViewById(R.id.totalFees)
        firstAid = findViewById(R.id.firstAid)
        landscapingl = findViewById(R.id.landscapingl)
        lifeSkill = findViewById(R.id.lifeSkill)
        sewing = findViewById(R.id.sewing)
        cookingc = findViewById(R.id.cookingc)
        childMinding = findViewById(R.id.childMinding)
        gardenMaintenance = findViewById(R.id.gardenMaintenance)

        val calculateButton: Button = findViewById(R.id.calculateButton)
        calculateButton.setOnClickListener { calculateFees() }
    }
    private fun calculateFees() {
        var total = 0.0

        // Sum the fees for selected courses
        if (firstAid.isChecked) total += 1500
        if (landscapingl.isChecked) total += 1500
        if (lifeSkill.isChecked) total += 1500
        if (sewing.isChecked) total += 1500
        if (cookingc.isChecked) total += 750
        if (childMinding.isChecked) total += 750
        if (gardenMaintenance.isChecked) total += 750

        //  discount(10%)
        val discount = total * 0.10
        total -= discount

        //  VAT (15%)
        val vat = total * 0.15
        total += vat

        totalFeesTextView.text = "Total Fees: $${"%.2f".format(total)}"



    }
}