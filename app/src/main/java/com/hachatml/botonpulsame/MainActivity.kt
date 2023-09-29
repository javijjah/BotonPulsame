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
    //aquí inicializo la variable para tener el contador globalmente y no dependiente de la función
var contarBoton = 0
    @SuppressLint("SetTextI18n")
    fun sumarUno(view: View) {
        contarBoton++ //esta var lleva la cuenta del número de pulsaciones
        var textView = findViewById<TextView>(R.id.textopulsa) //en estas líneas sincronizamos var con elemento
        var boton = findViewById<Button>(R.id.boton)
        when (contarBoton){ //aquí lo más conveniente es usar un when ya que son los únicos dos que son independientes
            1 -> textView.text = "Has pulsado el botón una vez!"
            2 -> textView.text = "Has pulsado el botón dos veces!"
        }
        if (contarBoton>2){ //a partir de aquí con la variable y un condicional nos bastará
            textView.text = "Has pulsado el botón " + contarBoton + " veces!"
        }
        if (contarBoton in 6..9){
            textView.textSize = 22F //cambio de tamaño
            textView.text ="Has hecho click varias veces (" + contarBoton + ")!" //y lo mismo que en la 28-29
        }
        if (contarBoton>10){
            boton.isEnabled = false //desactivamos el botón
            textView.text = "Te has pasado de clicks, máquina!" //cambiamos el textView
            Toast.makeText(this, "Se ha desactivado el botón", Toast.LENGTH_SHORT).show() //muestra el mensaje flotante (Toast)
        }
    }

}