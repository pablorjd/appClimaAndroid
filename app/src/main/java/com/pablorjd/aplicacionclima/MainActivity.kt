package com.pablorjd.aplicacionclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var tvCiudad:TextView? = null
    var tvGrados:TextView? = null
    var tvEstatus:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCiudad = findViewById(R.id.txtCiudad)
        tvGrados = findViewById(R.id.txtGrados)
        tvEstatus = findViewById(R.id.txtEstatus)


        val ciudad = intent.getStringExtra("CIUDAD")

        Toast.makeText(this,ciudad,Toast.LENGTH_LONG).show()


        val ciudadSantiago = Ciudad("Santiago de Chile", 17, "Nublado")
        val ciudadBerlin = Ciudad("Berlín", 10, "Lloviendo")


        if(ciudad == "santiago"){

            tvCiudad?.text = ciudadSantiago.nombre
            tvGrados?.text = ciudadSantiago.grados.toString() + "º"
            tvEstatus?.text = ciudadSantiago.estatus

        }else if(ciudad == "berlin"){

            tvCiudad?.text = ciudadBerlin.nombre
            tvGrados?.text = ciudadBerlin.grados.toString()  + "º"
            tvEstatus?.text = ciudadBerlin.estatus

        }else{

            Toast.makeText(this,"Informacion no encontrada",Toast.LENGTH_LONG).show()

        }






    }
}
