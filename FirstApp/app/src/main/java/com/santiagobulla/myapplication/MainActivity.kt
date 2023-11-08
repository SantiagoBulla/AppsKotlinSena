package com.santiagobulla.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val editTextName = findViewById<EditText>(R.id.editTextName)
//        val buttonSaludar = findViewById<Button>(R.id.buttonSaludar)
//
//        buttonSaludar.setOnClickListener {
//            var nameValue = editTextName.text.toString()
//            Toast.makeText(this, "Bienvenido $nameValue a mi primera app", Toast.LENGTH_LONG)
//                .show()//hacer un pop up
//            val intento =
//                Intent(this, Calculadora::class.java)//declarar la redireccion de activities
//            startActivity(intento)//ejecutar la redireccion

        //     }
        val editTextUsername = findViewById<EditText>(R.id.editTextUsername)
        val editTxtNumPassword = findViewById<EditText>(R.id.editTextNumberPassword)
        val btnLogin = findViewById<Button>(R.id.buttonLogin)

        btnLogin.setOnClickListener {
            var username = editTextUsername.text.toString()
            var password = editTxtNumPassword.text.toString()
            if (username == "joselin" && password == "1234") {
                val intento = Intent(this, Menu::class.java)//declarar la redireccion de activities
                startActivity(intento)
            } else {
                Toast.makeText(this, "Datos de ingreso incorrectos", Toast.LENGTH_LONG).show()
            }
        }
    }
}