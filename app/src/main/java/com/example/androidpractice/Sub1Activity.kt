package com.example.androidpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class Sub1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub1)

        var button1 = findViewById<Button>(R.id.sub1_button)

        button1.setOnClickListener{
            Log.i("sample", "pushed button1 on Sub1Activity")
            finish()
        }
    }
}
