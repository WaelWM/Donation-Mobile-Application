package com.example.cheerup.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.cheerup.R
import kotlinx.android.synthetic.main.activity_donate_money.*

class DonateMoney : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donate_money)

        suggestCenterTxt.setOnClickListener {
            startActivity(Intent(this@DonateMoney, Suggestion::class.java))
        }

        paymentbtn.setOnClickListener {
            startActivity(Intent(this@DonateMoney, Payment::class.java))
        }


        val adapter = ArrayAdapter.createFromResource(this,
            R.array.donation_centers, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        centerSpinner.adapter = adapter
    }






}




