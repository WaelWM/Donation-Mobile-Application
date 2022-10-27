package com.example.cheerup.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.cheerup.Navigation
import com.example.cheerup.R
import kotlinx.android.synthetic.main.activity_forgot_password.*

class ForgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        restPasswordBtn.setOnClickListener{

            Toast.makeText(this@ForgotPassword, "Email has been sent to your email to rest the password!", Toast.LENGTH_SHORT).show()
            restPasswordEmailTxt.text.clear()
            startActivity(Intent(this, Login::class.java))
        }
    }

}