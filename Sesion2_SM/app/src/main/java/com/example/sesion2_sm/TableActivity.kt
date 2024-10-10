package com.example.sesion2_sm

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.Drawable
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat


class TableActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table)

        val buttonLinear = findViewById<Button>(R.id.Linear)
        val buttonRelative = findViewById<Button>(R.id.Relative)
        val buttonTable = findViewById<Button>(R.id.Table)
        val defaultColor = buttonLinear.background
        val color = ContextCompat.getColor(this, R.color.purple_200) // Opciones de API

        // Metodos para cambiar el color cuando se pulsa
        setButtonTouchListener(buttonLinear, color, defaultColor)
        setButtonTouchListener(buttonRelative, color, defaultColor)
        setButtonTouchListener(buttonTable, color, defaultColor)

        // Cambiar de Actividad
        buttonLinear.setOnClickListener {
            val intent = Intent(this, LinearActivity::class.java)
            startActivity(intent)
        }
        buttonRelative.setOnClickListener {
            val intent = Intent(this, RelativeActivity::class.java)
            startActivity(intent)
        }
        buttonTable.setOnClickListener {
            val intent = Intent(this, TableActivity::class.java)
            startActivity(intent)
        }

    }

    @SuppressLint("ClickableViewAccessibility") // No se para que sirve la anotacion
    fun setButtonTouchListener(button: View, color: Int, defaultColor: Drawable) {
        button.setOnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Cambiar el color cuando se pulsa
                    button.setBackgroundColor(color)
                }
                MotionEvent.ACTION_UP -> {
                    // Restaurar el color original cuando se suelta
                    button.background = defaultColor
                }
            }
            true
        }
    }

}