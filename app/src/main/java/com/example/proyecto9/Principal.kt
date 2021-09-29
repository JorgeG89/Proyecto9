package com.example.proyecto9

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class Principal : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.button)
        val num1 = findViewById<EditText>(R.id.numero1)
        val num2 = findViewById<EditText>(R.id.numero2)
        val num3 = findViewById<EditText>(R.id.numero3)
        val num4 = findViewById<EditText>(R.id.numero4)
        val reSuma = findViewById<TextView>(R.id.textoSuma)
        val reProducto = findViewById<TextView>(R.id.textoProducto)

        boton.setOnClickListener {
            val val1 = num1.text.toString().toInt()
            val val2 = num2.text.toString().toInt()
            val val3 = num3.text.toString().toInt()
            val val4 = num4.text.toString().toInt()

            val suma= val1+val2+val3+val4
            val producto = val1*val2*val3*val4

            reSuma.setText("La suma de los cuatro valores es $suma")
            reProducto.setText("El producto de los cuatro valores es $producto")
        }
    }
}