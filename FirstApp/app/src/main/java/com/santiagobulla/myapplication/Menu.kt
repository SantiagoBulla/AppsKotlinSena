package com.santiagobulla.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnLogOut = findViewById<Button>(R.id.ButtonLogOut)
        val btnImageFibonacci = findViewById<Button>(R.id.buttonFibonacci)
        val btnImagebanco = findViewById<Button>(R.id.buttonBanco)
        val btnImageCalculadora = findViewById<Button>(R.id.buttonCalculadora)

        btnLogOut.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnImagebanco.setOnClickListener {
            val intent = Intent(this, Banco::class.java)
            startActivity(intent)
        }
        btnImageFibonacci.setOnClickListener {
            val intent = Intent(this, Fibonacci::class.java)
            startActivity(intent)
        }
        btnImageCalculadora.setOnClickListener {
            val intent = Intent(this, Calculadora::class.java)
            startActivity(intent)
        }


    }
}