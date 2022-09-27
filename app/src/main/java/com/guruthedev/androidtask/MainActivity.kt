package com.guruthedev.androidtask

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    var personData: ArrayList<Any> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        button.setOnClickListener {
            personData.add("Guru Prasad")
            personData.add(21)
            personData.add(20000.0)
            personData.add("Android Developer")
            val intent = Intent(this@MainActivity, DisplayData::class.java)
            intent.putExtra("key", personData)
            startActivity(intent)
        }
    }
}