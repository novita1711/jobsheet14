package com.example.novita14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val BUSANA = findViewById<Button>(R.id.Pink)
        val KULINER = findViewById<Button>(R.id.Yellow)
        val PPLG = findViewById<Button>(R.id.Blue)
        val TPFL = findViewById<Button>(R.id.Green)
        val TO = findViewById<Button>(R.id.Red)

        PPLG.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, blueFragment())
            fragmentTransaction.commit()
        }

        TPFL.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, greenFragment())
            fragmentTransaction.commit()
        }

        KULINER.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, yellowFragment())
            fragmentTransaction.commit()
        }

        BUSANA.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, pinkFragment())
            fragmentTransaction.commit()
        }

        TO.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, redFragment())
            fragmentTransaction.commit()
        }
    }
}