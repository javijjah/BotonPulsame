package com.hachatml.botonpulsame

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
var contarBoton = 0
    @SuppressLint("SetTextI18n")
    fun sumarUno(view: View) {
        contarBoton++
        var textView = findViewById<TextView>(R.id.textopulsa)
        var boton = findViewById<Button>(R.id.boton)
        when (contarBoton){
            1 -> textView.text = "Has pulsado el botón una vez!"
            2 -> textView.text = "Has pulsado el botón dos veces!"
        }
        if (contarBoton>2){
            textView.text = "Has pulsado el botón " + contarBoton + " veces!"
        }
        if (contarBoton in 6..9){
            textView.textSize = 22F
            textView.text ="Has hecho click varias veces (" + contarBoton + ")!"
        }
        if (contarBoton>10){
            boton.isEnabled = false
            textView.text = "Te has pasado de clicks, máquina!"
            Toast.makeText(this, "Se ha desactivado el botón", Toast.LENGTH_SHORT).show()
        }
    }

}