package com.example.mytsuclassroom.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mytsuclassroom.view.login.LoginFragment
import com.example.mytsuclassroom.LoginRegisterActivity
import com.example.mytsuclassroom.view.register.RegisterFragment
import com.example.mytsuclassroom.view.register.RegisterNameFragment

class TabPager(loginRegisterActivity: LoginRegisterActivity) :
    FragmentStateAdapter(loginRegisterActivity) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> LoginFragment()
            1 -> RegisterFragment()
            else -> throw IllegalArgumentException("Invalid position")
        }
    }
}