package com.example.cheerup.ui.fragments
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cheerup.activities.DonateMoney
import com.example.cheerup.activities.DonateOtherStuff
import com.example.cheerup.activities.DonationCenters
import com.example.cheerup.databinding.FragmentDonationBinding


class DonationFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val bind = FragmentDonationBinding.inflate(layoutInflater)

        bind.donateMoneyBtn.setOnClickListener{
            val intent = Intent (this@DonationFragment.requireContext(), DonateMoney::class.java)
            startActivity(intent)


        }

        bind.donateOthersBtn.setOnClickListener{
            val intent = Intent (this@DonationFragment.requireContext(), DonateOtherStuff::class.java)
            startActivity(intent)
        }

        bind.centerBtn.setOnClickListener{
            val intent = Intent (this@DonationFragment.context, DonationCenters::class.java)
            startActivity(intent)
        }

        return bind.root
    }


}

