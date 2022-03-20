package com.generation.dadosdigitaisup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class FourtyActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourty2)

        val lancard20 = findViewById<Button>(R.id.lancard20)

        lancard20.setOnClickListener {
        rolarDados20(20)
        }
    }

    fun rolarDados20(lados: Int) {
        val valor = (1..lados).random()
        val imageResourced20 = dice20(valor)
        val showdadod6 = findViewById<ImageView>(R.id.imageView8)
        showdadod6.setImageResource(imageResourced20)
    }
    private fun dice20(valor: Int): Int{
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
            12->R.drawable.d20_12
            13->R.drawable.d20_13
            14->R.drawable.d20_14
            15->R.drawable.d20_15
            16->R.drawable.d20_16
            17->R.drawable.d20_17
            18->R.drawable.d20_18
            19->R.drawable.d20_19
            else -> R.drawable.d20_20

        }
}}