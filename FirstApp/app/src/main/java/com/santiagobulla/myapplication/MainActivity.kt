package com.santiagobulla.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val buttonSaludar = findViewById<Button>(R.id.buttonSaludar)

        buttonSaludar.setOnClickListener {
            var nameValue = editTextName.text.toString()
            Toast.makeText(this,"Bienvenido $nameValue a mi primera app",Toast.LENGTH_LONG).show()
        }
    }
}