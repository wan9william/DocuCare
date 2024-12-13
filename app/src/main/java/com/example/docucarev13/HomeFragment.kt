package com.example.docucarev13

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.docucarev13.databinding.FragmentHomeBinding


class HomeFragment :  Fragment(){


    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.appointmentbutton.setOnClickListener {
            if (requireActivity() is MainActivity) {
                findNavController().navigate(R.id.action_homeFragment_to_appointmentFragment)
            }
        }

        binding.billingbutton.setOnClickListener {
            if (requireActivity() is MainActivity) {
                findNavController().navigate(R.id.action_homeFragment_to_billingFragment)
            }
        }

        binding.todobutton.setOnClickListener {
            if (requireActivity() is MainActivity) {
                findNavController().navigate(R.id.action_homeFragment_to_todoFragment)
            }
        }

        binding.medicationbutton.setOnClickListener {
            if (requireActivity() is MainActivity) {
                findNavController().navigate(R.id.action_homeFragment_to_medicationFragment)
            }
        }
        binding.testresultbutton.setOnClickListener {
            if (requireActivity() is MainActivity) {
                findNavController().navigate(R.id.action_homeFragment_to_testResultFragment)
            }
        }

        binding.notesbutton.setOnClickListener {
            if (requireActivity() is MainActivity) {
                findNavController().navigate(R.id.action_homeFragment_to_notesFragment)
            }
        }

        binding.logoutbutton.setOnClickListener {
            if (requireActivity() is MainActivity) {
                findNavController().navigate(R.id.action_homeFragment_to_loginFragment)
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}