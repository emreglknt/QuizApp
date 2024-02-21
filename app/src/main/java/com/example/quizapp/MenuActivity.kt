package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.LoginFilter.UsernameFilterGMail
import android.view.View
import android.widget.EditText


private var username :String? = null
private var activityId: Int = 0

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        username = intent.getStringExtra(Constants.USERNAME)

    }


    fun CountryFlagClick(view: View){
        activityId=1  // 1. kategori ülke bayrakları
        val intent = Intent(this,QuizQuestionsActivity::class.java)
        intent.putExtra(Constants.USERNAME, username)
        intent.putExtra(Constants.ACTIVITY_ID, activityId) // quiz questions için constants a bir id gönderiyor
        startActivity(intent)

    }


    fun TeamLogoClick(view: View){
        activityId=2  // 2. kategori takım logoları
        val intent = Intent(this,QuizQuestionsActivity::class.java)
        intent.putExtra(Constants.USERNAME, username)
        intent.putExtra(Constants.ACTIVITY_ID, activityId) // quiz questions için constants a bir id gönderiyor
        startActivity(intent)

    }



    fun CompanyClick(view: View){
        activityId=3  // 3.  Şirket logoları
        val intent = Intent(this,QuizQuestionsActivity::class.java)
        intent.putExtra(Constants.USERNAME, username)
        intent.putExtra(Constants.ACTIVITY_ID, activityId) // quiz questions icin constants a bir id gonderiyor.
        startActivity(intent)

    }




    fun TrueFalseClick(view: View){
        activityId=4  // 4.  True False
        val intent = Intent(this,QuizQuestionsActivity::class.java)
        intent.putExtra(Constants.USERNAME, username)
        intent.putExtra(Constants.ACTIVITY_ID, activityId) // quiz questions icin constants a bir id gonderiyor.
        startActivity(intent)

    }










}