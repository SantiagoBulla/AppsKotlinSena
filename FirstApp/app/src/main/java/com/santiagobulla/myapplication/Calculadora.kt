package com.santiagobulla.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        val num1 = findViewById<EditText>(R.id.editTextNumber1)
        val num2 = findViewById<EditText>(R.id.editTextNumber2)
        val txtResultado = findViewById<TextView>(R.id.textViewResultado)
        val btnCalcular = findViewById<Button>(R.id.buttonCalcular)
        val btnVolver = findViewById<Button>(R.id.buttonVolver)

        btnCalcular.setOnClickListener {
            val numero1 = num1.text.toString().toDouble()
            val numero2 = num2.text.toString().toDouble()
            val resultado: Double = numero1 + numero2
            txtResultado.text = "El resultado es: ${resultado.toString()}"
        }

        btnVolver.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}