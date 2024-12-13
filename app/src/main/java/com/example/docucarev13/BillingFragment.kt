package com.example.docucarev13

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.docucarev13.databinding.FragmentBillingBinding

class BillingFragment : Fragment() {
    private lateinit var binding: FragmentBillingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBillingBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.homebutton.setOnClickListener {
            if (requireActivity() is MainActivity) {
                findNavController().navigate(R.id.action_billingFragment_to_homeFragment)
            }
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}