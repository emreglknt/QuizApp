package com.example.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class registerActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var btnregister : Button
    private lateinit var registerEmail :TextView
    private lateinit var registerPassword :TextView
    private lateinit var loginText :TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        // Initialize Firebase Auth
        auth = Firebase.auth
        btnregister =findViewById(R.id.btnregister)
        registerEmail =findViewById(R.id.registerEmail)
        registerPassword = findViewById(R.id.registerPassword)
        loginText = findViewById(R.id.loginText)

        loginText.setOnClickListener{
            val intent = Intent(this,loginActivity::class.java)
            startActivity(intent)
        }


        btnregister.setOnClickListener{

            when {
                TextUtils.isEmpty(registerEmail.text.toString().trim(){
                    it <= ' ' })->{
                        Toast.makeText(this,
                            "Please enter email!",
                            Toast.LENGTH_SHORT).show()
                    }

                TextUtils.isEmpty(registerPassword.text.toString().trim(){
                    it <= ' ' })->{
                    Toast.makeText(this,
                        "Please enter the Password!",
                        Toast.LENGTH_SHORT).show()
                }

                // iki alan da boş değilse değerler girilmişse
                else-> {
                    // iki dizede de girilen boşluklu veriyi alıp temizleyerek
                    // orjinal stringe indirger.
                    val email:String = registerEmail.text.toString().trim{it<=' '}
                    val password:String = registerPassword.text.toString().trim{it<=' '}

                    auth.createUserWithEmailAndPassword(email,password).addOnSuccessListener {
                        Toast.makeText(this,"You registered Successfully",Toast.LENGTH_LONG).show()
                        val intent = Intent(this,loginActivity::class.java)
                        startActivity(intent)
                        finish()
                    }.addOnFailureListener {// fail olursa
                        Toast.makeText(this,it.localizedMessage,Toast.LENGTH_LONG).show()
                    }
                }
            }
        }

    }
}