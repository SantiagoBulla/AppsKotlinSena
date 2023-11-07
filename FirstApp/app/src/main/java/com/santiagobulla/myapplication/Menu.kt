package com.santiagobulla.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnLogOut = findViewById<ImageButton>(R.id.imageButtonLogOut)
        val btnImageFibonacci = findViewById<ImageButton>(R.id.imageButtonFibonacci)
        val btnImagebanco = findViewById<ImageButton>(R.id.imageButtonBanco)
        val btnImageCalculadora = findViewById<ImageButton>(R.id.imageButtonCalculadora)

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