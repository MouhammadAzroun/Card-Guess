package com.example.cardguessing

import android.content.Intent
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
            val intent = Intent(this, Game_Activity :: class.java)
            startActivity(intent)
        }

        howToPlay.setOnClickListener(){
            val intent = Intent(this, HowToPlayActivity::class.java)
            startActivity(intent)
        }
    }
}