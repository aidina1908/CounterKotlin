package com.example.android.counterkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById(R.id.button) as Button

        button.setOnClickListener() {
        txt.start()
        }
    }

        val txt = object : Thread(){
            override fun run() {
                while (!isInterrupted){
                    try {
                        Thread.sleep(1000)
                        runOnUiThread{
                            counter += 1
                            textview.text = counter.toString()
                        }
                    } catch (e : InterruptedException){
                        e.printStackTrace()
                    }
                }

            }
        }

    }

