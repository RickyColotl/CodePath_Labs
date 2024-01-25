package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var counter = 0;
    var increment = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<ImageButton>(R.id.button)
        val upgradeButton = findViewById<Button>(R.id.upgradeBtn)
        val textView = findViewById<TextView>(R.id.num)
        button.setOnClickListener{
            //code for counter and if condition for == 100 inside if upgrade increment
            counter += increment
            if (counter >= 100 && increment == 1){
                upgradeButton.visibility = View.VISIBLE
            }
            textView.text = counter.toString()
        }

        upgradeButton.setOnClickListener {
            upgradeButton.text = "Add 2"
            increment += 1
            upgradeButton.visibility = View.INVISIBLE
        }
    }
}