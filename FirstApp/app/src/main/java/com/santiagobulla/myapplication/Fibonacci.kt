package com.santiagobulla.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Fibonacci : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fibonacci)

        val btnVolver = findViewById<Button>(R.id.buttonFiboVolver)
        val btnGenerar = findViewById<Button>(R.id.buttonGenerarFibo)
        val secuencia = findViewById<TextView>(R.id.textViewRtaFibo)
        val tamanoSecuencia = findViewById<EditText>(R.id.editTextNumberSignedTamano)

        btnVolver.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        btnGenerar.setOnClickListener {
            val tamano = tamanoSecuencia.text.toString().toInt()
            val stringBuilder = StringBuilder()  // stringBuilder para construir la cadena
            var a = 0
            var b = 1
            for (i in 1..tamano) {
                stringBuilder.append("$a ,")
                var c = a + b
                a = b
                b = c
            }
            secuencia.text = stringBuilder.toString()
        }


    }
}