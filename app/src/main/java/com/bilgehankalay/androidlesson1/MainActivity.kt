package com.bilgehankalay.androidlesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Dice(val yuzSayisi: Int, val imView : ImageView){
    fun getRandomFace() : Int{
        return (1..yuzSayisi).random()
    }
    fun changeFaceIm(picture : Int){
        imView.setImageResource(picture)
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Button = findViewById(R.id.zarAt)
        val result : TextView = findViewById(R.id.labelSonuc)
        val imView : ImageView = findViewById(R.id.imageView)
        val zar = Dice(6,imView)
        zar.changeFaceIm(R.drawable.dice_0)
        button.setOnClickListener {
            when(zar.getRandomFace()){
                1 -> {
                    result.text = "Bir"
                    zar.changeFaceIm(R.drawable.dice_1)
                }
                2 -> {
                    result.text = "İki"
                    zar.changeFaceIm(R.drawable.dice_2)
                }
                3 -> {
                    result.text = "Üç"
                    zar.changeFaceIm(R.drawable.dice_3)
                }
                4 -> {
                    result.text = "Dört"
                    zar.changeFaceIm(R.drawable.dice_4)
                }
                5 -> {
                    result.text = "Beş"
                    zar.changeFaceIm(R.drawable.dice_5)
                }
                6 -> {
                    result.text = "Altı"
                    zar.changeFaceIm(R.drawable.dice_6)
                }
            }
        }
    }
}