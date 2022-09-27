package com.guruthedev.androidtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayData : AppCompatActivity() {
    private lateinit var txtData: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_data)

        txtData = findViewById(R.id.textView)
        val displayData = intent.getSerializableExtra("key")
        txtData.text = displayData.toString()
    }
}