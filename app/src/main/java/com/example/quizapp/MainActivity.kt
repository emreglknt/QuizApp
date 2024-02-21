package com.example.quizapp

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var appName: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val play_button = findViewById<Button>(R.id.play_button)
        val nameText = findViewById<EditText>(R.id.nameText)

        appName = findViewById<TextView>(R.id.app_name)
        val animation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        appName.startAnimation(animation)


        play_button.setOnClickListener {

        if (nameText.text.toString().isEmpty()){
            Toast.makeText(this,
                "Please enter your name",Toast.LENGTH_SHORT).show()
        }


        else{
            //intent ile bu contexten diğer contexte (activity sayfasına)
            // butona tıklanıldığında geçiş yapabiliyoruz
            val intent = Intent(this, MenuActivity::class.java)
            intent.putExtra(Constants.USERNAME,nameText.text.toString())
            startActivity(intent)
            finish()
        }

    }


    }



}