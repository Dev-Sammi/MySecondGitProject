package com.example.android.mysecondgitproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Second Commit")
        println("try again")
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{

        }
    }

}