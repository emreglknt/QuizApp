package com.example.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    lateinit var congratsText: TextView
    private var mediaPlayer: MediaPlayer? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // Activity başlangıcında müziği başlatacak
        mediaPlayer = MediaPlayer.create(this,R.raw.congrats); // "sample_music" dosyasının adını kendi dosyanızın adıyla değiştirin
        mediaPlayer?.start()


        val usernameText= findViewById<TextView>(R.id.usernameText)

        val username = intent.getStringExtra(Constants.USERNAME) //constant a mainden gönderdiğimiz username ini burada alıp
                                                            // bir değişkene tanımladık
        usernameText.text = username

        val scoreText = findViewById<TextView>(R.id.scoreText)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswer = intent.getIntExtra(Constants.correctAnswers,0)
        scoreText.text = "Your score is $correctAnswer out of $totalQuestions"

        val resButton = findViewById<Button>(R.id.result_button)

        congratsText = findViewById<TextView>(R.id.congratsText)
        val animation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        congratsText.startAnimation(animation)



        resButton.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }


    override fun onDestroy() {
        super.onDestroy()
        //nullable
        mediaPlayer?.release() // Aktivite sona erince müziği kapatır
        mediaPlayer = null
    }






}