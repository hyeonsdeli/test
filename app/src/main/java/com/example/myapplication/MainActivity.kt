package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val test = 1
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}