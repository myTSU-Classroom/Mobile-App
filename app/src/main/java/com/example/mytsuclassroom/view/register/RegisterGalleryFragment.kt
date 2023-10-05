package com.example.mytsuclassroom.view.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.navigation.Navigation
import com.example.mytsuclassroom.R
import com.example.mytsuclassroom.databinding.FragmentRegisterConfirmBinding
import com.example.mytsuclassroom.databinding.FragmentRegisterGalleryBinding

class RegisterGalleryFragment : Fragment() {
    private var _binding: FragmentRegisterGalleryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegisterGalleryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = Navigation.findNavController(view)

        binding.btnNext.setOnClickListener {
            navController.navigate(R.id.action_registerGalleryFragment_to_registerSelectFragment)
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