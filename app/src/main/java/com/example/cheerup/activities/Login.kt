package com.example.cheerup.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.example.cheerup.Navigation
import com.example.cheerup.R
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.loginEmail
import kotlinx.android.synthetic.main.activity_login.loginBtn
import kotlinx.android.synthetic.main.activity_register.*


class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        forgotPasswordTxt.setOnClickListener{
                startActivity(Intent(this@Login, ForgotPassword::class.java))
        }

        registerText.setOnClickListener {
            startActivity(Intent(this@Login, Register::class.java))
        }

        loginBtn.setOnClickListener {
            when {
                TextUtils.isEmpty(loginEmail.text.toString().trim() { it <= ' ' }) -> {
                    Toast.makeText(
                        this@Login,
                        "Please Enter your Email Address",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                TextUtils.isEmpty(loginPassword.text.toString().trim() { it <= ' ' }) -> {
                    Toast.makeText(
                        this@Login,
                        "Please Enter your Password",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                else -> {
                    val email: String = loginEmail.text.toString().trim {it <= ' '}
                    val password: String = loginPassword.text.toString().trim {it <= ' '}
                    FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(OnCompleteListener<AuthResult>{ task ->
                            if (task.isSuccessful) {
                                Toast.makeText(
                                    this@Login,
                                    "You have logged into the system!",
                                    Toast.LENGTH_SHORT
                                ).show()

                                // direct the user to the login page:

                                val intent =
                                    Intent(this@Login, Navigation::class.java)
                                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                                startActivity(intent)
                                finish() 
                            } else {

                                Toast.makeText(
                                    this@Login,
                                    task.exception!!.message.toString(),
                                    Toast.LENGTH_SHORT
                                ).show()
                            }

                        })
                }
            }
        }
    }
}
