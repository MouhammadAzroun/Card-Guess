package com.example.cardguessing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Game_Activity : AppCompatActivity() {
    lateinit var card1 : ImageView
    lateinit var card2 : ImageView
    lateinit var score : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        card1 = findViewById(R.id.card1ImageView)
        card2 = findViewById(R.id.card2ImageView)
        score = findViewById(R.id.scoreTextView)

        val leftButton = findViewById<Button>(R.id.leftButton)
        leftButton.setOnClickListener{

        }

        val rightButton = findViewById<Button>(R.id.rightButton)
        rightButton.setOnClickListener{

        }
    }
}