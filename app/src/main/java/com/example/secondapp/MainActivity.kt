package com.example.secondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    private lateinit var true_button: Button
    private lateinit var false_button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        true_button = findViewById(R.id.true_button)
        false_button = findViewById(R.id.false_button)


        true_button.setOnClickListener{
            val toast_value = Toast.makeText(this, R.string.correct_toast, Toast.LENGTH_SHORT)
            toast_value.setGravity(Gravity.TOP, 0, 0)
            toast_value.show()
        }

        false_button.setOnClickListener{
            val toast_value = Toast.makeText(this, R.string.incorrect_toast, Toast.LENGTH_SHORT)
            toast_value.setGravity(Gravity.TOP, 0, 0)
            toast_value.show()
        }


    }
}