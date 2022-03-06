package com.example.ejemplonavegacionactividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActividadB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_b)

        val botonc = findViewById<Button>(R.id.botonc)
        val botond = findViewById<Button>(R.id.botond)

        botonc.setOnClickListener{
            var intent = Intent(this, ActividadC::class.java)
            startActivity(intent)
        }
        botond.setOnClickListener{
            var intent = Intent(this, ActividadD::class.java)
            startActivity(intent)
        }
    }
}