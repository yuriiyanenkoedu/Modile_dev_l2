package com.example.ad_lab2.ui.video

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.ad_lab2.databinding.FragmentSlideshowBinding
import com.example.ad_lab2.databinding.FragmentVideoBinding
import com.example.ad_lab2.ui.slideshow.SlideshowViewModel

class VideoFragment : Fragment() {
    private var _binding : FragmentVideoBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val videoViewModel =
            ViewModelProvider(this).get(VideoViewModel::class.java)

        _binding = FragmentVideoBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textVideo
        videoViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}