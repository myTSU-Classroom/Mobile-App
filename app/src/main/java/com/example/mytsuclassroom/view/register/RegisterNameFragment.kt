package com.example.mytsuclassroom.view.register

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.mytsuclassroom.R
import com.example.mytsuclassroom.databinding.FragmentRegisterNameBinding

class RegisterNameFragment : Fragment() {
    private var _binding: FragmentRegisterNameBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegisterNameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = Navigation.findNavController(view)

        binding.btnNext.setOnClickListener {
            navController.navigate(R.id.action_registerNameFragment_to_registerBirthFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}