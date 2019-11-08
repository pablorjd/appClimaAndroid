package com.pablorjd.aplicacionclima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_cuidades.*

class CuidadesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuidades)

        val TAG = "CIUDAD"


        btnSantiago.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG,"santiago")
            startActivity(intent)
        }

        btnBerlin.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG,"berlin")
            startActivity(intent)
        })




    }
}
