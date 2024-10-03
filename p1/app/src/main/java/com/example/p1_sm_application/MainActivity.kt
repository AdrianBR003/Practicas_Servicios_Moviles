package com.example.p1_sm_application

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val iName = findViewById<TextInputEditText>(R.id.TxINombre)
        val iApellidos = findViewById<TextInputEditText>(R.id.TxIApellidos)
        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener { mandarPagina(iName, iApellidos) }



    }

    fun mandarPagina(iName: TextInputEditText, iApellidos: TextInputEditText){
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("nombre", iName.text.toString())
        intent.putExtra("apellidos", iApellidos.text.toString())
        startActivity(intent)
    }
}