package com.example.cheerup.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cheerup.R
import com.example.cheerup.adapter.CenterAdapter
import com.example.cheerup.adapter.EventAdapter
import com.example.cheerup.models.Center
import com.example.cheerup.models.Event
import kotlinx.android.synthetic.main.activity_donation_centers.*


class DonationCenters : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donation_centers)

        val centers = listOf(

            Center( 1, "https://firebasestorage.googleapis.com/v0/b/cheerup-1028d" +
                    ".appspot.com/o/center1.PNG?alt=media&token=83c3a902-ba55-4301-bdf4-1c20bd57f22a",
                "Lighthouse Children Welfare", "Selangor"),
            Center(2, "https://firebasestorage.googleapis.com/v0/b/cheerup-1028d.appspot.com/o/" +
                    "Center2.png?alt=media&token=4106a040-f887-40b2-a961-130d9610513c",
                "Yayasan Chow Kit", "Kuala Lumpur"),
            Center( 3, "https://firebasestorage.googleapis.com/v0/b/cheerup-1028d.appspot.com/o/" +
                    "Center3.jpg?alt=media&token=dc684cf3-463e-4ca3-b3fb-cc5b1fdfc07c",
                "Hospis Malaysia", "Kuala Lumpur")


        )

        centersRecyclerView.layoutManager = LinearLayoutManager(this)
        centersRecyclerView.adapter = CenterAdapter(centers)
    }


}