package com.santiagobulla.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

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
            val number1 = num1.text.toString()
            val number2 = num2.text.toString()

            if (number1.isNotEmpty() && number2.isNotEmpty()) {
                try {
                    val resultado = calcularResultado(number1.toDoubleOrNull(), number2.toDoubleOrNull(), spinner.selectedItem.toString())
                    if (resultado != null) {
                        txtResultado.text = "El resultado es: $resultado"
                        num1.text.clear()
                        num2.text.clear()
                    } else {
                        Toast.makeText(this, "Ingrese valores numéricos válidos para el cálculo", Toast.LENGTH_LONG).show()
                    }
                } catch (e: IllegalArgumentException) {
                    Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_LONG).show()
            }
        }


        btnVolver.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }

    fun calcularResultado(numero1: Double?, numero2: Double?, operacion: String): Double? {
        if (numero1 != null && numero2 != null && numero1 > 0 && numero2 > 0) {
            return when (operacion) {
                "suma" -> numero1 + numero2
                "resta" -> numero1 - numero2
                "multiplicacion" -> numero1 * numero2
                "division" -> numero1 / numero2
                "modulo" -> numero1 % numero2
                else -> throw IllegalArgumentException("Operación no válida")
            }
        }
        return null
    }
}