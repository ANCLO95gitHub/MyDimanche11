package com.example.mydimanche11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.CheckBox

class GoogleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_google)
        val url ="https://www.google.ca"
        val urlLaval = "https://www.ulaval.ca"
        //val myCheckBox =  findViewById<CheckBox>(R.id.cbCheckBox)
        val web = findViewById<WebView>(R.id.webView)

        web.loadUrl(urlLaval)
    }
}