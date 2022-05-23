package com.example.rostelicom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnONas: Button = findViewById(R.id. btnONas)

        btnONas.setOnClickListener{
            val intent = Intent(this, ONasActivity::class.java)
            startActivity(intent)
        }

        val btnContact: Button = findViewById(R.id. btnContact)

        btnContact.setOnClickListener{
            val intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)
        }

        val btnPractic: Button = findViewById(R.id. btnPractic)

        btnPractic.setOnClickListener{
            val intent = Intent(this, PracticActivity::class.java)
            startActivity(intent)
        }

    }


}