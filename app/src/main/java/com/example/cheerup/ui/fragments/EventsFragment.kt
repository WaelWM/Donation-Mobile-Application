package com.example.cheerup.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cheerup.RegisteredEvents
import com.example.cheerup.activities.Events
import com.example.cheerup.adapter.EventAdapter
import com.example.cheerup.databinding.FragmentEventsBinding
import com.example.cheerup.models.Event

class EventsFragment : Fragment() {



  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val bind = FragmentEventsBinding.inflate(layoutInflater)

    bind.Eventsbtn.setOnClickListener{
      val intent = Intent (this@EventsFragment.requireContext(), Events::class.java)
      startActivity(intent)

    }

    bind.registeredEventsBtn.setOnClickListener{
      val intent = Intent (this@EventsFragment.requireContext(), RegisteredEvents::class.java)
      startActivity(intent)

    }


    return bind.root
  }


}
