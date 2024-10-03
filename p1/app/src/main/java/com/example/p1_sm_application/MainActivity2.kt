package com.example.p1_sm_application

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        val nombre = intent.getStringExtra("nombre")?:"Desconocido"
        val apellidos = intent.getStringExtra("apellidos")?:"Desconocido"

        val textviewNombre:TextView = findViewById(R.id.TxVvNombre)
        textviewNombre.text= nombre

        val textviewApellidos:TextView = findViewById(R.id.TxVvApellidos)
        textviewApellidos.text= apellidos
    }
}