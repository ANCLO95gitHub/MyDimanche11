package com.example.mydimanche11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //setTheme(R.style.MyAppTheme);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myCheckBox = findViewById<TextView>(R.id.tvForActivity2)
        val myBoutton =  findViewById<Button>(R.id.bMybutton)
        myCheckBox.text = "Dedans activity 2"
        myBoutton.text = "Button activity 2"

    }
}