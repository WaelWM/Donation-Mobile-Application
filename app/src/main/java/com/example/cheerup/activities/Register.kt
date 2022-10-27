package com.example.cheerup.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.example.cheerup.Navigation
import com.example.cheerup.R
import com.example.cheerup.firestoreDatabase.firestoreClass
import com.example.cheerup.models.Users
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_donate_money.view.*
import kotlinx.android.synthetic.main.activity_register.*


class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        loginText.setOnClickListener {
            startActivity(Intent(this@Register, Login::class.java))
        }

        registerBtn.setOnClickListener {
            when {

                TextUtils.isEmpty(firstName.text.toString().trim() { it <= ' ' }) -> {
                    Toast.makeText(
                        this@Register,
                        "Please Enter your First Name",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                TextUtils.isEmpty(lastName.text.toString().trim() { it <= ' ' }) -> {
                    Toast.makeText(
                        this@Register,
                        "Please Enter your Last Name",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                TextUtils.isEmpty(registerEmail.text.toString().trim() { it <= ' ' }) -> {
                    Toast.makeText(
                        this@Register,
                        "Please Enter your Email Address",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                TextUtils.isEmpty(address.text.toString().trim() { it <= ' ' }) -> {
                    Toast.makeText(
                        this@Register,
                        "Please Enter your Address",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                TextUtils.isEmpty(phone.text.toString().trim() { it <= ' ' }) -> {
                    Toast.makeText(
                        this@Register,
                        "Please Enter your Phone Number",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                TextUtils.isEmpty(registerPassword.text.toString().trim() { it <= ' ' }) -> {
                    Toast.makeText(
                        this@Register,
                        "Please Enter your Password",
                        Toast.LENGTH_SHORT
                    ).show()

                }

                TextUtils.isEmpty(confirmPassword.text.toString().trim() { it <= ' ' }) -> {
                    Toast.makeText(
                        this@Register,
                        "Please Enter your Password Again in Confirm Password ",
                        Toast.LENGTH_SHORT
                    ).show()


                }

                registerPassword.text.toString().trim { it <= ' ' } != confirmPassword.text.toString()
                    .trim { it <= ' ' } -> {
                    Toast.makeText(
                        this@Register,
                        "Password and Confirm Password Does not match!",
                        Toast.LENGTH_SHORT
                    ).show()

                }

                else -> {
                    val email: String = registerEmail.text.toString().trim {it <= ' '}
                    val password: String = registerPassword.text.toString().trim {it <= ' '}

                    FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(OnCompleteListener<AuthResult>{ task ->
                            if (task.isSuccessful) {

                                //Register User in firebase
                                val firebaseUser: FirebaseUser = task.result!!.user!!

                                val User = Users(
                                    firebaseUser.uid,
                                    firstName.text.toString().trim {it <= ' '},
                                    lastName.text.toString().trim {it <= ' '},
                                    registerEmail.text.toString().trim {it <= ' '},
                                    address.text.toString().trim {it <= ' '})
                                // record users in firestore database
                                firestoreClass().registerUser(this@Register, User)

                                Toast.makeText(
                                    this@Register,
                                    "You have registered into the system!",
                                    Toast.LENGTH_SHORT
                                ).show()

                                // direct the user to the login page:

                                val intent =
                                    Intent(this@Register, Navigation::class.java)
                                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                                startActivity(intent)
                                finish()
                            } else {


                                Toast.makeText(
                                    this@Register,
                                    task.exception!!.message.toString(),
                                    Toast.LENGTH_SHORT
                                ).show()
                            }

                        })
                }
            }

        }
    }

    fun userRegistrationSuccess(){


        Toast.makeText(
            this@Register,
            resources.getString(R.string.register_success),
            Toast.LENGTH_SHORT
        )
    }

}
