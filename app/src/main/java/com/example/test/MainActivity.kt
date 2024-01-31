package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val generate: Button = findViewById(R.id.button)
        generate.setOnClickListener{
            val passTextView: TextView = findViewById(R.id.textView)
            passTextView.text = "Password died"
            val toast = Toast.makeText(this, "Password generated", Toast.LENGTH_LONG)
            toast.show()
            val rndPass = StringBuilder()
            for (i in 0 until 10) {
                if (i % 2 == 0) {
                    val dig = Random().nextInt(10)
                    rndPass.append(dig)
                }else {
                    val letter = (97 + Random().nextInt(26)).toChar()
                    rndPass.append(letter)
                }
                passTextView.text = rndPass
            }
        }
    }
}