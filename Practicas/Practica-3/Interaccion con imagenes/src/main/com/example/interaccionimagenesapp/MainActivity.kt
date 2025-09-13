package com.example.interaccionimagenesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

/**
 * Práctica 3 - Ejercicio 1
 * Descripción: Mostrar imagen y lanzar Toast al hacer clic.
 * Autor: [Melvin Yabar Carazas]
 * Fecha creación: [hoy]
 * Última modificación: [hoy]
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imagen = findViewById<ImageView>(R.id.miImagen)

        imagen.setOnClickListener {
            Toast.makeText(this, "¡Hiciste clic en la imagen!", Toast.LENGTH_SHORT).show()
        }
    }
}
