package com.example.ad_lab2.ui.tabbed_activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.ad_lab2.databinding.FragmentTabbedActivityBinding

class TabbedActivityFragment : Fragment() {
    private var _binding: FragmentTabbedActivityBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val tabbedactivityViewModel =
            ViewModelProvider(this).get(TabbedActivityViewModel::class.java)

        _binding = FragmentTabbedActivityBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.tabbedText
        tabbedactivityViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}