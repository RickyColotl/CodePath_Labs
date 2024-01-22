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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<ImageButton>(R.id.button)
        val upgradeButton = findViewById<Button>(R.id.upgradeBtn)
        val textView = findViewById<TextView>(R.id.num)
        button.setOnClickListener{
            //Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()
            counter++
            textView.text = counter.toString()

            if(counter >= 100 ){
                upgradeButton.visibility = View.VISIBLE
                upgradeButton.setOnClickListener{
                    upgradeButton.text = "Add 2"

                    button.setOnClickListener{
                        counter += 2
                        textView.text = counter.toString()
                    }
                    upgradeButton.visibility = View.INVISIBLE
                }
            }
        }
    }
}