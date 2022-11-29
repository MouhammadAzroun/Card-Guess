package com.example.cardguessing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class Game_Activity : AppCompatActivity() {
    lateinit var card1 : ImageView
    lateinit var card2 : ImageView
    lateinit var score : TextView
    var scoreCounter = 0
    val listOfCards = intArrayOf(
        R.drawable.ace_of_hearts,
        R.drawable.two_of_hearts,
        R.drawable.three_of_hearts,
        R.drawable.four_of_hearts,
        R.drawable.five_of_hearts,
        R.drawable.six_of_hearts,
        R.drawable.seven_of_hearts,
        R.drawable.eight_of_hearts,
        R.drawable.nine_of_hearts,
        R.drawable.ten_of_hearts
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        card1 = findViewById(R.id.card1ImageView)
        card2 = findViewById(R.id.card2ImageView)
        score = findViewById(R.id.scoreTextView)
        score.text = "Score: $scoreCounter"

        val leftButton = findViewById<Button>(R.id.leftButton)
        leftButton.setOnClickListener{
            leftButtonCheck()
        }

        val rightButton = findViewById<Button>(R.id.rightButton)
        rightButton.setOnClickListener{
            rightButtonCheck()
        }
    }

    fun leftButtonCheck(){
        var leftCard = Random.nextInt(listOfCards.size)
        var rightCard = Random.nextInt(listOfCards.size)
        setCardImage(leftCard,card1)
        setCardImage(rightCard,card2)

        if(leftCard>rightCard){
            scoreCounter++
            score.text = "Score: $scoreCounter"
        }
        else{
            val intent = Intent(this, Lose_Activity :: class.java)
            intent.putExtra("KEY", scoreCounter)
            startActivity(intent)
        }
    }

    fun rightButtonCheck(){
        var leftCard = Random.nextInt(listOfCards.size)
        var rightCard = Random.nextInt(listOfCards.size)
        setCardImage(leftCard,card1)
        setCardImage(rightCard,card2)

        if(leftCard<rightCard){
            scoreCounter++
            score.text = "Score: $scoreCounter"
        }
        else{
            val intent = Intent(this, Lose_Activity :: class.java)
            intent.putExtra("KEY", scoreCounter)
            startActivity(intent)
        }
    }

    private fun setCardImage(number:Int, image:ImageView){
        image.setImageResource(listOfCards[number])
    }
}