package com.santiagobulla.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Banco : AppCompatActivity() {

    private var jose: Cliente = Cliente(111, "jose", 500000f)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banco)

        val btnVolver = findViewById<Button>(R.id.buttonBancoVolver)

        val btnConsultarCuenta = findViewById<Button>(R.id.buttonConsultarSaldo)
        val txtViewSaldo = findViewById<TextView>(R.id.textViewSaldoCuenta)
        val btnConsignar = findViewById<Button>(R.id.buttonConsignar)
        val valorConsignacion = findViewById<EditText>(R.id.editTextNumConsignar)
        val btnRetirar = findViewById<Button>(R.id.buttonRetirar)
        val valorRetiro = findViewById<EditText>(R.id.editTextNumRetirar)

        btnVolver.setOnClickListener {
            jose.saldoCuenta = this.consultarSaldo()
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
            Toast.makeText(this, "Su saldo final en cuenta es: ${this.estadoCuenta()}", Toast.LENGTH_SHORT).show()
        }

        btnConsultarCuenta.setOnClickListener {
            txtViewSaldo.text = "Usted tiene un saldo en cuenta de: ${this.consultarSaldo()}"
        }

        btnConsignar.setOnClickListener {
            val valorConsignacionStr = valorConsignacion.text.toString()
            if (valorConsignacionStr.isNotEmpty()) {
                try {
                    val dinero = valorConsignacionStr.toFloat()
                    if (dinero > 0) {
                        consignar(dinero)
                        Toast.makeText(this, "Consignación exitosa", Toast.LENGTH_SHORT).show()
                        valorConsignacion.text.clear()
                    } else {
                        Toast.makeText(this, "Ingrese un valor válido para la consignación", Toast.LENGTH_SHORT).show()
                    }
                } catch (e: NumberFormatException) {
                    Toast.makeText(this, "Ingrese un valor numérico válido para la consignación", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Por favor, ingrese un valor para la consignación", Toast.LENGTH_SHORT).show()
            }
        }

        btnRetirar.setOnClickListener {
            val valorRetiroStr = valorRetiro.text.toString()

            if (valorRetiroStr.isNotEmpty()) {
                try {
                    val dinero = valorRetiroStr.toFloat()
                    if (dinero > 0) {
                        val rta = retirar(dinero)
                        if (rta) {
                            Toast.makeText(this, "Retiro exitoso", Toast.LENGTH_SHORT).show()
                        } else {
                            Toast.makeText(this, "Retiro inválido, la cantidad de dinero supera el monto en cuenta", Toast.LENGTH_SHORT).show()
                        }
                        valorRetiro.text.clear()
                    } else {
                        Toast.makeText(this, "Ingrese un valor válido para el retiro", Toast.LENGTH_SHORT).show()
                    }
                } catch (e: NumberFormatException) {
                    Toast.makeText(this, "Ingrese un valor numérico válido para el retiro", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Por favor, ingrese un valor para el retiro", Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun consignar(valorConsignacion: Float) {
        jose.consignar(valorConsignacion)
    }

    private fun retirar(valorRetiro: Float): Boolean {
        return if (valorRetiro <= jose.saldoCuenta) {
            jose.retirar(valorRetiro)
            true
        } else {
            false
        }
    }

    private fun consultarSaldo():Float {
        return jose.imprimir()
    }

    private fun estadoCuenta():Float {
        return jose.saldoCuenta
    }
}