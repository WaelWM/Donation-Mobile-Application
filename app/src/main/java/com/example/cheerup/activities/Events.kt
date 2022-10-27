package com.example.cheerup.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cheerup.R
import com.example.cheerup.adapter.EventAdapter
import com.example.cheerup.models.Event
import kotlinx.android.synthetic.main.activity_events.*


class Events : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events)

        val events = listOf(

            Event( 1, "https://firebasestorage.googleapis.com/v0/b/cheerup-1028d.appspot.com/o/event4.PNG?alt=media&token=0e443bd9-415f-4034-9564-7cc6ac4bbb8e",
                "Discussion Event", "Online"),
            Event(2, "https://firebasestorage.googleapis.com/v0/b/cheerup-1028d.appspot.com/o/event2.PNG?alt=media&token=13823781-7481-4f38-ade2-50ba11f8a87b",
                "Sport Fundraising Event", "Physical"),
            Event( 3, "https://firebasestorage.googleapis.com/v0/b/cheerup-1028d.appspot.com/o/event3.PNG?alt=media&token=a5bd647f-6f72-46ec-b3cb-65afd2a34dfe",
                "Help People In need", "Hybrid"),
            Event(4, "https://firebasestorage.googleapis.com/v0/b/cheerup-1028d.appspot.com/o/event1.PNG?alt=media&token=0ca7433f-68f8-4030-8854-30b391651d92",
                "We are for each other", "Hybrid")
        )

        eventsRecyclerView.layoutManager = LinearLayoutManager(this)
        eventsRecyclerView.adapter = EventAdapter(events)
    }


}