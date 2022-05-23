package com.example.rostelicom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PracticActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practic)

        val btnPhoto: Button = findViewById(R.id. btnPhoto)

        btnPhoto.setOnClickListener{
            val intent = Intent(this, PhotoActivity::class.java)
            startActivity(intent)
        }
    }
}