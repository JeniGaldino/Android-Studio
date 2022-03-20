package com.generation.dadosdigitaisup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ThirdActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third2)

        val lancard12 = findViewById<Button>(R.id.lancard12)

        lancard12.setOnClickListener {
        rolarDados12(12)
        }


    }

    fun rolarDados12(lados: Int) {

        val valor = (1..lados).random()
        val imageResourced12 = dice12(valor)
        val showdadod6 = findViewById<ImageView>(R.id.imageView6)
        showdadod6.setImageResource(imageResourced12)

    }
    private fun dice12(valor:Int): Int{
        return when (valor){

            1-> R.drawable.d20_1
            2-> R.drawable.d20_2
            3-> R.drawable.d20_3
            4->R.drawable.d20_4
            5->R.drawable.d20_5
            6->R.drawable.d20_6
            7->R.drawable.d20_7
            8->R.drawable.d20_8
            9->R.drawable.d20_9
            10->R.drawable.d20_10
            11->R.drawable.d20_11
            else ->R.drawable.d20_12
        }
}}
