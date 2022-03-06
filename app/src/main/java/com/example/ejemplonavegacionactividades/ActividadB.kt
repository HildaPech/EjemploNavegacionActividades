package com.example.ejemplonavegacionactividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActividadB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_b)

        val botonc = findViewById<Button>(R.id.botonc)
        val botond = findViewById<Button>(R.id.botond)

        val mensaje = intent.getStringExtra("MENSAJE")

        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()

        botonc.setOnClickListener{
            var intent = Intent(this, ActividadC::class.java)
            intent.putExtra("MENSAJE", "Hacia Actividad C")
            intent.putExtra("MENSAJEA", mensaje)
            startActivity(intent)
        }
        botond.setOnClickListener{
            var intent = Intent(this, ActividadD::class.java)
            intent.putExtra("MENSAJE", "Hacia Actividad D")
            startActivity(intent)
        }
    }
}