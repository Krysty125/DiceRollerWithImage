package com.example.dicerollerwithimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    //var diceImage : ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll : Button =  findViewById(R.id.btn_Roll)

        btnRoll.setOnClickListener() {
            rollDice()
        }
    }

    private fun rollDice() {

        val randomInt = (1..6).random()

        //val diceImage : ImageView = findViewById(R.id.dice_image) //declaration for image (ori)

        val diceImage : ImageView = findViewById(R.id.dice_image)

        val drawableResource = when (randomInt) { //the image will show based on the random number
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)

    }
}