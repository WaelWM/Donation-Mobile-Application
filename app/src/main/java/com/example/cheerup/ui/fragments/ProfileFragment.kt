package com.example.cheerup.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cheerup.activities.DonateMoney
import com.example.cheerup.activities.Login
import com.example.cheerup.databinding.FragmentProfileBinding
import com.example.cheerup.models.Users
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : Fragment() {

    lateinit var auth: FirebaseAuth
    private lateinit var firebaseUser: FirebaseUser

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind = FragmentProfileBinding.inflate(layoutInflater)

        bind.logoutBtn.setOnClickListener {
            val intent = Intent(this@ProfileFragment.requireContext(), Login::class.java)
            startActivity(intent)
        }


        return bind.root
    }
}


