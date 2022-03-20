package com.generation.dadosdigitaisup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val choiceButtonD6 = findViewById<Button>(R.id.choicebuttond6)
        val choiceButtonD12 = findViewById<Button>(R.id.choicebutton12)
        val choiceButtonD20 = findViewById<Button>(R.id.choicebutton20)
        val backbuttond6 = findViewById<Button>(R.id.backd6)
        val backbuttond12 = findViewById<Button>(R.id.backd12)
        val backbuttond20 = findViewById<Button>(R.id.backd20)

        val intentSecond = Intent(this, SecondActivity2::class.java)
        val intentThird = Intent(this, ThirdActivity2::class.java)
        val intentFourth = Intent(this, FourtyActivity2::class.java)


        choiceButtonD6.setOnClickListener {
            startActivity(intentSecond)
        }

        choiceButtonD12.setOnClickListener {
            startActivity(intentThird)
        }

        choiceButtonD20.setOnClickListener {
            startActivity(intentFourth)
        }
        backbuttond6.setOnClickListener {
            finish()
        }
        backbuttond12.setOnClickListener {
            finish()
        }
        backbuttond20.setOnClickListener {
            finish()
        }
    }
}