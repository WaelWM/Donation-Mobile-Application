package com.example.cheerup.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.cheerup.Navigation
import com.example.cheerup.R
import com.example.cheerup.activities.Login
import com.example.cheerup.activities.MainActivity
import kotlinx.android.synthetic.main.activity_navigation.*


class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        goToMain()

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
    }

    private fun goToMain() {
        Handler().postDelayed({
            val mIntent = Intent(this, Login::class.java)
            startActivity(mIntent)
            finish()
        }, 1500)

    }

}


