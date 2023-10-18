package com.example.mytsuclassroom.view.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.mytsuclassroom.R
import com.example.mytsuclassroom.databinding.FragmentRegisterGradeBinding

class RegisterGradeFragment : Fragment() {
    private var _binding: FragmentRegisterGradeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegisterGradeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = Navigation.findNavController(view)

        binding.btnNext.setOnClickListener {
            navController.navigate(R.id.action_registerGradeFragment_to_registerConfirmFragment)
        }

        binding.btnBack.setOnClickListener {
            navController.navigateUp()
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            navController.navigateUp()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}