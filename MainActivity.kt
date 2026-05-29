package com.example.actividad1_login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Esto le dice a la actividad que use el archivo activity_main.xml
        setContentView(R.layout.activity_main)
    }
}