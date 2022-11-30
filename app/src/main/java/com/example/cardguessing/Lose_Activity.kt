package com.example.cardguessing

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Lose_Activity : AppCompatActivity() {
    lateinit var finalScore : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lose)

        //To get the sent information from Game_activity which is the scoreCounter.
        finalScore = findViewById(R.id.finalScoreTextView)
        var scoreFromGame = intent.getIntExtra("KEY",0 )
        finalScore.text = "Final score: $scoreFromGame"

        //tryAgainButton starts Game_Activity
        val tryAgainButton = findViewById<Button>(R.id.tryAgainButton)
        tryAgainButton.setOnClickListener{
            val intent = Intent(this, Game_Activity :: class.java)
            startActivity(intent)
        }

        //finishButton starts mainActivity
        val finishButton = findViewById<Button>(R.id.finishButton)
        finishButton.setOnClickListener{
            val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
        }
    }
}