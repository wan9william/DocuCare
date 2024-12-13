package com.example.docucarev13

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.docucarev13.databinding.FragmentTestresultBinding

class TestResultFragment : Fragment() {
    private lateinit var binding: FragmentTestresultBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestresultBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.homebutton.setOnClickListener {
            if (requireActivity() is MainActivity) {
                findNavController().navigate(R.id.action_testResultFragment_to_homeFragment)
            }
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}