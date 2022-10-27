package com.example.cheerup.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cheerup.databinding.FragmentCommunityBinding
import com.example.cheerup.databinding.FragmentDonationBinding

class CommunityFragment : Fragment(){

    private var _binding: FragmentCommunityBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentCommunityBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }


}