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
            Toast.makeText(this, "banco", Toast.LENGTH_SHORT).show()
        }
        btnImageFibonacci.setOnClickListener {
            Toast.makeText(this, "fibo", Toast.LENGTH_SHORT).show()
        }
        btnImageCalculadora.setOnClickListener {
            val intent = Intent(this, Calculadora::class.java)
            startActivity(intent)
        }


    }
}