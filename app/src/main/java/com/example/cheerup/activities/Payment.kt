package com.example.cheerup.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.cheerup.Navigation
import com.example.cheerup.R
import com.example.cheerup.databinding.FragmentDonationBinding
import com.example.cheerup.ui.fragments.DonationFragment
import com.google.android.gms.dynamic.SupportFragmentWrapper
import kotlinx.android.synthetic.main.activity_payment.*
import kotlinx.android.synthetic.main.fragment_donation.*

class Payment : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        val monthAdapter = ArrayAdapter.createFromResource(
            this,
            R.array.months, android.R.layout.simple_spinner_item
        )
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        monthSpinner.adapter = monthAdapter

        val yearAdapter = ArrayAdapter.createFromResource(
            this,
            R.array.years, android.R.layout.simple_spinner_item
        )
        yearAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        yearSpinner.adapter = yearAdapter

        DonateBtn.setOnClickListener {


            Toast.makeText(this, "Donation Success! Thank you ", Toast.LENGTH_SHORT).show()
            CardNumberTxT.text.clear()
            CardCvvTxt.text.clear()
            startActivity(Intent(this@Payment, Navigation::class.java))

        }


    }


}