package com.generation.dadosdigitaisup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SecondActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        val lancard6 = findViewById<Button>(R.id.lancard6)

        lancard6.setOnClickListener {
            rolarDados(6)
        }

    }
    fun rolarDados(lados:Int) {

        val valor = (1..lados).random()


        val imageResourced6 = dice6(valor)


        val showdadod6 = findViewById<ImageView>(R.id.imageView4)

        showdadod6.setImageResource(imageResourced6)

    }
    private fun dice6 (valor:Int): Int {
        return when (valor) {

            1-> R.drawable.dado_1
            2-> R.drawable.dado_2
            3-> R.drawable.dado_3
            4->R.drawable.dado_4
            5->R.drawable.dado_5
            else-> R.drawable.dado_6
        }
    }
}