package com.santiagobulla.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        val num1 = findViewById<EditText>(R.id.editTextNumber1)
        val num2 = findViewById<EditText>(R.id.editTextNumber2)
        val spinner = findViewById<Spinner>(R.id.spinnerOperacion)
        val txtResultado = findViewById<TextView>(R.id.textViewResultadoCal)
        val btnCalcular = findViewById<Button>(R.id.buttonCalcular)
        val btnVolver = findViewById<Button>(R.id.buttonVolverCal)

        btnCalcular.setOnClickListener {
            val numero1 = num1.text.toString().toDouble()
            val numero2 = num2.text.toString().toDouble()
            val operacion = spinner.selectedItem.toString()

            val resultado = when (operacion) {
                "suma" -> numero1 + numero2
                "resta" -> numero1 - numero2
                "multiplicacion" -> numero1 * numero2
                "division" -> numero1 / numero2
                "modulo" -> numero1 % numero2
                else -> throw IllegalArgumentException("Operación no válida")
            }

            txtResultado.text = "El resultado es: $resultado"
        }

        btnVolver.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}