package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variables
        val startbtn = findViewById<Button>(R.id.startbtn)
        val nametext = findViewById<EditText>(R.id.nametext)

        //btn function
        startbtn.setOnClickListener {
            if(nametext.text.toString().isEmpty())
                Toast.makeText(this, "Please Enter Name", Toast.LENGTH_SHORT).show()
            else{
                val intent = Intent(this, QuesActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}