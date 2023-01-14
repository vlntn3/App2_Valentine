package com.example.colorcombine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pbtn= findViewById(R.id.primarycolorbutton) as Button

        pbtn.setOnClickListener {
            val intent = Intent(this, PrimaryColor::class.java)
            startActivity(intent)
        }

        val sbtn= findViewById(R.id.secondarycolorbutton) as Button

        sbtn.setOnClickListener {
            val intent = Intent(this, SecondaryColor::class.java)
            startActivity(intent)
        }

        val tbtn= findViewById(R.id.tertiarycolorbutton) as Button

        tbtn.setOnClickListener {
            val intent = Intent(this, TertiaryColor::class.java)
            startActivity(intent)
        }
    }
}
