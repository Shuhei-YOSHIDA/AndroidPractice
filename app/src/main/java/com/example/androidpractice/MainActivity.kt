package com.example.androidpractice

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
            Log.i("testtag", "pushed start button")
            start_button.setText(R.string.pushed_start_button_text)
        }
    }
}
