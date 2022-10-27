package com.example.cheerup.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.cheerup.Navigation
import com.example.cheerup.R
import com.example.cheerup.databinding.ActivityDonateOtherStuffBinding
import kotlinx.android.synthetic.main.activity_donate_other_stuff.*

class DonateOtherStuff : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donate_other_stuff)


        val binding = ActivityDonateOtherStuffBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arrayList_centers =
            arrayListOf<String>("Lighthouse Children Welfare", "Yayasan Chow Kit", "Hospis Malaysia")
        val arrayAdapter_centers =
            ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, arrayList_centers)
        binding.centersSpinner.adapter = arrayAdapter_centers


        val arrayList_center1 = arrayListOf<String>("Cloths", "Books", "Toys")
        val arrayList_center2 = arrayListOf<String>("Electronics", "Toys")
        val arrayList_center3 = arrayListOf<String>("Furniture", "Electronics", "Books")


        binding.centersSpinner.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {

                    if (position == 0) {
                        val arrayAdapterCenter1 = ArrayAdapter(
                            applicationContext,
                            R.layout.support_simple_spinner_dropdown_item, arrayList_center1
                        )
                        binding.itemAcceptedSpinner.adapter = arrayAdapterCenter1
                    }

                    if (position == 1) {
                        val arrayAdapterCenter2 = ArrayAdapter(
                            applicationContext,
                            R.layout.support_simple_spinner_dropdown_item, arrayList_center2
                        )
                        binding.itemAcceptedSpinner.adapter = arrayAdapterCenter2
                    }

                    if (position == 2) {
                        val arrayAdapterCenter3 = ArrayAdapter(
                            applicationContext,
                            R.layout.support_simple_spinner_dropdown_item, arrayList_center3
                        )
                        binding.itemAcceptedSpinner.adapter = arrayAdapterCenter3
                    }


                }

                override fun onNothingSelected(parent: AdapterView<*>?) {


                }

            }

        submitDonationBtn.setOnClickListener {


            Toast.makeText(this, "Donation Details Received! Thank you ", Toast.LENGTH_SHORT).show()
            donationDecriptionTxt.text.clear()
            startActivity(Intent(this@DonateOtherStuff, Navigation::class.java))


        }
    }

}