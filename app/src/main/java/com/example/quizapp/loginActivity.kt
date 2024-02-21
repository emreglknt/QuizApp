package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.quizapp.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase






class loginActivity : AppCompatActivity() {



    private lateinit var auth: FirebaseAuth

    private lateinit var loginbuton : Button
    private lateinit var loginemail :TextView
    private lateinit var loginpassword :TextView
    private lateinit var registerText :TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        auth=Firebase.auth


        loginbuton=findViewById(R.id.btnlogin)
        loginemail=findViewById(R.id.loginEmail)
        loginpassword=findViewById(R.id.loginPassword)
        registerText=findViewById(R.id.registerText)



        registerText.setOnClickListener{
            val intent = Intent(this@loginActivity,registerActivity::class.java)
            startActivity(intent)
        }


        loginbuton.setOnClickListener {

            when {
                TextUtils.isEmpty(loginemail.text.toString().trim() {
                    it <= ' '
                }) -> {
                    Toast.makeText(
                        this,
                        "Please enter email!",
                        Toast.LENGTH_SHORT
                    ).show()
                }


                TextUtils.isEmpty(loginpassword.text.toString().trim() {
                    it <= ' '
                }) -> {
                    Toast.makeText(
                        this,
                        "Please enter the Password!",
                        Toast.LENGTH_SHORT
                    ).show()
                }


                // iki alan da boş değilse değerler girilmişse
                else -> {

                    // iki dizede de girilen boşluklu veriyi alıp temizleyerek
                    // orjinal stringe indirger.
                    val email: String = loginemail.text.toString().trim { it <= ' ' }
                    val password: String = loginpassword.text.toString().trim { it <= ' ' }

                    auth.signInWithEmailAndPassword(email, password).addOnSuccessListener {
                        Toast.makeText(this, "You logged in Successfully", Toast.LENGTH_LONG)
                            .show()
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                        finish()
                    }.addOnFailureListener {// fail olursa
                        Toast.makeText(this@loginActivity, it.localizedMessage, Toast.LENGTH_LONG)
                            .show()
                    }
                }
            }

        }







    }

}