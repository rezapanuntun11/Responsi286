package com.example.responsi286

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailEditText=findViewById<EditText>(R.id.emailEditText)
        val passEditText=findViewById<EditText>(R.id.passEditText)

        val btn_login=findViewById<Button>(R.id.btn_login)
        val btn_daftar=findViewById<Button>(R.id.btn_daftar)

        btn_login.setOnClickListener {
            val email= emailEditText.toString()
            val pass= passEditText.toString()
            val user:String="responsi"
            val nama:String="reza"
            if (email == "rezapanuntun@gmail.com" && pass == "reza123"){

                intent.putExtra("nama",nama)
                intent.putExtra("user",user)
                intent.putExtra("email",email)
                intent.putExtra("pass",pass)
                intent=Intent(this,Preview::class.java)
                startActivity(intent)

            }


        }
        btn_daftar.setOnClickListener {
            intent=Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }


    }


}

