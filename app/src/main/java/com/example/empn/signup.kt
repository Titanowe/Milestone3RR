package com.example.empn

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
lateinit var Payment_Button:Button

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)


        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val phoneEditText = findViewById<EditText>(R.id.phoneEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val signupButton = findViewById<Button>(R.id.signupButton)
        val messageTextView = findViewById<TextView>(R.id.messageTextView)
        Payment_Button=findViewById(R.id.Payment_Button)

        signupButton.setOnClickListener {
            messageTextView.text="$nameEditText"
            messageTextView.text="Thank you for joining the Nation"
        }

        Payment_Button.setOnClickListener {
            startActivity((Intent(this,CalculatActivityt::class.java)))
        }
    }
}