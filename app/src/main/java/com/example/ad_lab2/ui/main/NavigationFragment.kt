package com.example.ad_lab2.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.ad_lab2.MainActivity
import com.example.ad_lab2.R

class NavigationFragment : Fragment() {
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tabbed_navigator, container, false)

        val button = view.findViewById<Button>(R.id.button_go_to_main)
        button.setOnClickListener {
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}