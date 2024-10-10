package com.example.sesion2_sm

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat
import com.example.sesion2_sm.ui.theme.Sesion2_SMTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        val buttonLinear = findViewById<Button>(R.id.Linear)
        val buttonRelative = findViewById<Button>(R.id.Relative)
        val buttonTable = findViewById<Button>(R.id.Table)
        val defaultColor = buttonLinear.background
        val color = ContextCompat.getColor(this, R.color.purple_200) // Opciones de API

        // Metodos para cambiar el color cuando se pulsa
        setButtonTouchListener(buttonLinear, color, defaultColor)
        setButtonTouchListener(buttonRelative, color, defaultColor)
        setButtonTouchListener(buttonTable, color, defaultColor)
        
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