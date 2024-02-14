package com.example.mydimanche11

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val myCheckBox =  findViewById<CheckBox>(R.id.cbCheckBox)
        val mybButtonTwisted = findViewById<Button>(R.id.bButtonTwisted)
        val myButtonSecondAc = findViewById<Button>(R.id.bButtonCenter)
        myCheckBox.setOnClickListener(){
            if(mybButtonTwisted.text =="clickedE")
                mybButtonTwisted.text = "clickedEXXX"
            else
                mybButtonTwisted.text = "clickedE"
//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
        }
        mybButtonTwisted.setOnClickListener(){
            if( myCheckBox.text == "what do wantz")
                myCheckBox.text = "I wantz everything"
            else
                myCheckBox.text = "what do wantz"
        }
        myButtonSecondAc.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        /*setContent {
            MyDimanche11Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                Greeting("Android ZAQ")
                }
            }
        }*/
    }
}
/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyDimanche11Theme {
        Greeting("Android")
    }
}*/