package com.example.cardguessing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startGame = findViewById<Button>(R.id.button1)
        val howToPlay = findViewById<Button>(R.id.button2)

        startGame.setOnClickListener(){

        }

        howToPlay.setOnClickListener(){

        }
    }
}