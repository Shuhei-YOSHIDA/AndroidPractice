package com.example.androidpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var start_button_text = findViewById<TextView>(R.id.start_button)
        var start_button = findViewById<Button>(R.id.start_button)

        start_button.setOnClickListener{
            Log.i("sample", "pushed start button")
            start_button.setText(R.string.pushed_start_button_text)
        }

        var sub1_button = findViewById<Button>(R.id.button_to_sub1)

        sub1_button.setOnClickListener{
            Log.i("sample", "pushed button to sub1")
            val intent = Intent(application, Sub1Activity::class.java)
            startActivity(intent)
        }
    }
}
