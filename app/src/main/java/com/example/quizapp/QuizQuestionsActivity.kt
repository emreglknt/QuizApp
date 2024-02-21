package com.example.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.quizapp.Constants.tfQuestions


class QuizQuestionsActivity : AppCompatActivity() ,View.OnClickListener {

    private var mcurrentposition:Int = 1
    private var mQuestionList:ArrayList<questions>?= null
    private var mSelectedOptionPos : Int=0

    private lateinit var pb: ProgressBar
    private lateinit var txtp: TextView
    private lateinit var txtquestion: TextView

    private lateinit var op1: TextView
    private lateinit var op2: TextView
    private lateinit var op3: TextView
    private lateinit var op4: TextView

    private lateinit var submitButton: Button
    private lateinit var flag: ImageView
    private var correctAnswer : Int = 0
    private var username :String? = null


    private var music : ImageView ?= null
    private var isAnswered = false
    private var mediaPlayer: MediaPlayer? = null
    private lateinit var jokerButton :Button


    private var jokerUsed = false
    private var jokerCount = 2



        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        // Activity başlangıcında müziği başlatacak
        mediaPlayer = MediaPlayer.create(this,R.raw.quizmusic); // "sample_music" dosyasının adını kendi dosyanızın adıyla değiştirin
       mediaPlayer?.start()

              music = findViewById(R.id.musiconoff)

            jokerButton = findViewById<Button>(R.id.jokerButton)

        val activityId = intent.getIntExtra(Constants.ACTIVITY_ID, 0) // hangi aktivite ona göre soruları belirle





        // id lere göre kategori sorularını belirle

        when (activityId) {
            1 -> {
                mQuestionList = Constants.getQuestions()
            }
            2 -> {
                mQuestionList = Constants.TeamFlagQuestions()
            }
            3 -> {
                mQuestionList = Constants.CompanyQuestions()
            }

            4->{
                mQuestionList = Constants.tfQuestions()
            }

        }


        username = intent.getStringExtra(Constants.USERNAME)
        // Bileşenleri burada başlatın
        pb = findViewById(R.id.progressBar)
        txtp = findViewById(R.id.textProgress)
        txtquestion = findViewById(R.id.Textquestion)
        flag=findViewById(R.id.imgflag)
        submitButton = findViewById(R.id.submitButton)

        op1 = findViewById(R.id.option1)
        op2 = findViewById(R.id.option2)
        op3 = findViewById(R.id.option3)
        op4 = findViewById(R.id.option4)
        mQuestionList?.shuffle() // soruları karışık getirir
        setQuestion()


        op1.setOnClickListener(this)
        op2.setOnClickListener(this)
        op3.setOnClickListener(this)
        op4.setOnClickListener(this)

        submitButton.setOnClickListener(this)
        submitButton.isEnabled = false





        jokerButton.setOnClickListener {
            useJoker()
            jokerCount--
            if(jokerCount==0){
                jokerButton.isEnabled = false
            }

        }




    }




    private fun useJoker() {
        if (!jokerUsed &&!isAnswered) {
            val question = mQuestionList?.get(mcurrentposition - 1)

            // Doğru cevabı bulun
            val correctAnswer = question?.correctAnswer ?: 1

            // Rastgele yanlış bir cevap seçin
            var randomWrongAnswer: Int
            do {
                randomWrongAnswer = (1..4).random()
            } while (randomWrongAnswer == correctAnswer)

            // Yanlış cevabı görünmez yapın
            when (randomWrongAnswer) {
                1 -> op1.visibility = View.INVISIBLE
                2 -> op2.visibility = View.INVISIBLE
                3 -> op3.visibility = View.INVISIBLE
                4 -> op4.visibility = View.INVISIBLE
            }

            // Joker butonunu devre dışı bırakın
            jokerButton.isEnabled = false
            jokerButton.visibility = View.INVISIBLE
            jokerUsed = true
            isAnswered = true
        }
    }




    private fun resetOptionsVisibility() {
        op1.visibility = View.VISIBLE
        op2.visibility = View.VISIBLE
        op3.visibility = View.VISIBLE
        op4.visibility = View.VISIBLE
    }








    override fun onDestroy() {
        super.onDestroy()
        //nullable
        mediaPlayer?.release() // Aktivite sona erince müziği kapatır
        mediaPlayer = null

    }

    override fun onPause() {
        super.onPause()
        mediaPlayer?.pause()
    }

    override fun onResume() {
        super.onResume()
        mediaPlayer?.start()
    }


    private fun resetJoker() {
        jokerUsed = false
    }

    private fun setQuestion() {
        resetOptionsVisibility()
        resetJoker()
        val question = mQuestionList!![mcurrentposition - 1]
        defaultOptionsView()

        submitButton.isEnabled = false

        if (mcurrentposition == mQuestionList!!.size) {
            submitButton.text = "FINISH"
        } else {
            submitButton.text = "SUBMIT"
        }

        pb.progress = mcurrentposition
        pb.max = mQuestionList!!.size
        txtp.text = "$mcurrentposition / ${pb.max}"
        txtquestion.text = question.question
        flag.setImageResource(question.image)

        op1.text = question.optionA
        op2.text = question.optionB
        op3.text = question.optionC
        op4.text = question.optionD
    }







    @SuppressLint("SuspiciousIndentation")
    private  fun defaultOptionsView(){
        val options = ArrayList<TextView>()
            options.add(0,op1)
            options.add(1,op2)
            options.add(2,op3)
            options.add(3,op4)

        for (op in options){
            op.setTextColor(Color.parseColor("#7A8089"))
            op.typeface = Typeface.DEFAULT
            op.background = ContextCompat.getDrawable(this,
                R.drawable.edittext_background
            )
        }
    }





    override fun onClick(vi: View?) {
        when(vi?.id){
            R.id.option1 ->{
                selecetedOption(op1,1)
            }

            R.id.option2 ->{
                selecetedOption(op2,2)
            }

            R.id.option3 ->{
                selecetedOption(op3,3)
            }

            R.id.option4 ->{
                selecetedOption(op4,4)
            }

            R.id.submitButton ->{

                if(mSelectedOptionPos == 0){
                    mcurrentposition++
                    when{
                        mcurrentposition <= mQuestionList!!.size ->{
                            setQuestion()
                            enableOptions()
                        }else ->{
                          val intent = Intent(this,ResultActivity::class.java)
                            intent.putExtra(Constants.USERNAME,username)
                            intent.putExtra(Constants.correctAnswers,correctAnswer)
                            intent.putExtra(Constants.TOTAL_QUESTIONS,mQuestionList!!.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                }
                else{
                    val question = mQuestionList?.get(mcurrentposition-1)
                    if(question!!.correctAnswer != mSelectedOptionPos){
                        isCorrect(mSelectedOptionPos,R.drawable.incorrect_option_border)
                    }else{
                        correctAnswer++

                    }

                    isCorrect(question.correctAnswer,R.drawable.correct_option_border)

                    disableOptions()

                    if(mcurrentposition == mQuestionList!!.size){
                        submitButton.text = "Finish"
                    }
                    else{
                        submitButton.text = "Go to Next Question" //son soru değilse buton bir sonraki soruya gec yazısı oluyor
                    }
                    mSelectedOptionPos = 0 //seçilen seçenek pozisyonunun
                                          // tekrardan 0 a eşitle (soru değişince)



                }

            }

        }
    }





    private fun disableOptions() {
        op1.isEnabled = false
        op2.isEnabled = false
        op3.isEnabled = false
        op4.isEnabled = false
    }

    private fun enableOptions() {
        op1.isEnabled = true
        op2.isEnabled = true
        op3.isEnabled = true
        op4.isEnabled = true
    }



    private fun isCorrect(answer:Int,drawableView: Int){ // correcct olan seçeneğin border ını ayarlar
        when(answer){

                1->{
                    op1.background = ContextCompat.getDrawable(
                        this,drawableView)
                }


                2->{
                    op2.background = ContextCompat.getDrawable(
                        this,drawableView)
                }

                3->{
                    op3.background = ContextCompat.getDrawable(
                        this,drawableView)
                }


                4->{
                    op4.background = ContextCompat.getDrawable(
                        this,drawableView)
                }
        }
    }






    private fun selecetedOption(txtV: TextView,selectedOp:Int){

        defaultOptionsView()
        mSelectedOptionPos = selectedOp
        txtV.setTextColor(Color.parseColor("#363A43"))
        txtV.setTypeface(txtV.typeface,Typeface.BOLD)
        txtV.background = ContextCompat.getDrawable(this,
            R.drawable.selected_option_border)

        submitButton.isEnabled = true

        isAnswered = true

    }


    fun soundClick(view: View) {
        if (mediaPlayer != null) {
            if (mediaPlayer!!.isPlaying) {
                mediaPlayer!!.pause()
                music?.setImageResource(R.drawable.soundoff)

            }
            else {
                mediaPlayer!!.start()
                music?.setImageResource(R.drawable.soundonicon)
            }
        }
    }





}