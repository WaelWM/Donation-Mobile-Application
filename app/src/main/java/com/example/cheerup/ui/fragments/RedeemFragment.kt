package com.example.cheerup.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.cheerup.databinding.FragmentRedeemBinding



class RedeemFragment : Fragment() {

private var _binding: FragmentRedeemBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {



    _binding = FragmentRedeemBinding.inflate(inflater, container, false)
    val root: View = binding.root



    return root
  }


}