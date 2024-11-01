package com.example.empn

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


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

        signupButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val phone = phoneEditText.text.toString()
            val email = emailEditText.text.toString()


        }
    }
}