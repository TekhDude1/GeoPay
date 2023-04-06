package com.example.geopay.fragmentScreen.miniFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import com.example.geopay.R


class fragment_mini_settings_apppermissions : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        requireActivity().onBackPressedDispatcher.addCallback(
            viewLifecycleOwner,
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    for (i: Int in 1..parentFragmentManager.backStackEntryCount) {
                        parentFragmentManager.popBackStack()
                    }
                }
            })
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mini_settings_apppermissions, container, false)
    }

}