package com.example.kotlin_task2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstActivity: AppCompatActivity() {
    private lateinit var mainBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout)

        mainBtn = findViewById(R.id.btnMain)
        mainBtn.text = getString(R.string.first_screen)
        mainBtn.setOnClickListener {
            // Action we want the OS to take
            val intent = Intent(this, SecondActivity::class.java)

            startActivity(intent)
        }
    }
}