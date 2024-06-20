package com.example.signup

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.signup.R

class MainActivity : AppCompatActivity() {

    private lateinit var editTextUsername: EditText
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonSignup: Button
    private lateinit var textViewWelcome: TextView
    private lateinit var textViewEmail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextUsername = findViewById(R.id.editTextUsername)
        editTextEmail = findViewById(R.id.editTextEmail)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonSignup = findViewById(R.id.buttonSignup)
        textViewWelcome = findViewById(R.id.textViewWelcome)
        textViewEmail = findViewById(R.id.textViewEmail)

        buttonSignup.setOnClickListener {
            val username = editTextUsername.text.toString()
            val email = editTextEmail.text.toString()

            textViewWelcome.text = "Welcome, $username!"
            textViewEmail.text = "Your email: $email"

            textViewWelcome.visibility = View.VISIBLE
            textViewEmail.visibility = View.VISIBLE

            editTextUsername.visibility = View.GONE
            editTextEmail.visibility = View.GONE
            editTextPassword.visibility = View.GONE
            buttonSignup.visibility = View.GONE
        }
    }
}
