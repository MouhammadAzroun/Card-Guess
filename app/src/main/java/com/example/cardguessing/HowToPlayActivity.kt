package com.example.cardguessing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HowToPlayActivity : AppCompatActivity() {
    lateinit var howToPlayText : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_how_to_play)

        howToPlayText = findViewById(R.id.textView2)
        howToPlayText.text = "How to play: \n" +
                "\n" +
                "The game is played by \n" +
                "guessing which side \n" +
                "card is higher. \n" +
                "\n" +
                "You earn points \n" +
                "by guessing right. \n" +
                "\n" +
                "You lose the game if you\n" +
                "guess wrong. \n" +
                "Good luck!"

        val backButton = findViewById<Button>(R.id.back)

        backButton.setOnClickListener(){
            finish()
        }
    }
}