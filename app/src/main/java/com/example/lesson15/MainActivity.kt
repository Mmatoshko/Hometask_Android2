package com.example.lesson15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var textView2: TextView
    private lateinit var button: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        textView2 = findViewById(R.id.textView2)
        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        var i = 0

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                button.setOnClickListener {
                    textView.text = "${Singleton.astrology[i].toString()}"
                }
            }
        })
        button2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                button2.setOnClickListener {
                    i++;if (i > Singleton.astrology.size - 1) i = 0;
                    textView.text = "${Singleton.astrology[i].toString()}"
                }
            }
        })
        button3.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                button3.setOnClickListener {
                    i--;if (i < 0) i = 0; textView.text = "${Singleton.astrology[i].toString()}"
                }
            }
        })
    }

}