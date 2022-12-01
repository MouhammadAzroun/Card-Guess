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

    //scoreCounter is to keep track of the score and its initial value is 0
    var scoreCounter = 0

    // a list of ten images (Ace and up to ten of hearts)
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
        //leftButton contains leftButtonCheck function
        leftButton.setOnClickListener{
            leftButtonCheck()
        }

        val rightButton = findViewById<Button>(R.id.rightButton)
        //rightButton contains rightButtonCheck function
        rightButton.setOnClickListener{
            rightButtonCheck()
        }
    }

    /*this method is to choose two random cards from the list
    and check if the left card is bigger or smaller
    than the right card. if correct adds one to the
    scoreCounter, and if not it sends the last scoreCounter
    to Lose_Activity and starts Lose_Activity.*/
    fun leftButtonCheck(){
        var leftCard = Random.nextInt(listOfCards.size)
        var rightCard = Random.nextInt(listOfCards.size)
        setCardImage(leftCard,card1)
        setCardImage(rightCard,card2)

        if(leftCard>rightCard){
            scoreCounter++
            score.text = "Score: $scoreCounter"
        }
        else if(leftCard == rightCard){
            score.text = "Score: $scoreCounter \n DRAW!"
        }
        else{
            val intent = Intent(this, Lose_Activity :: class.java)
            intent.putExtra("KEY", scoreCounter)
            startActivity(intent)
        }
    }

    /*this method is to chose two random cards from the list
      and check if the right card is bigger or smaller
      than the left card. if correct adds one to the
      scoreCounter, and if not it sends the last scoreCounter
      to Lose_Activity and starts Lose_Activity.*/
    fun rightButtonCheck(){
        var leftCard = Random.nextInt(listOfCards.size)
        var rightCard = Random.nextInt(listOfCards.size)
        setCardImage(leftCard,card1)
        setCardImage(rightCard,card2)

        if(leftCard<rightCard){
            scoreCounter++
            score.text = "Score: $scoreCounter"
        }
        else if(leftCard == rightCard){
            score.text = "Score: $scoreCounter \n DRAW!"
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