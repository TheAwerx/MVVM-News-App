package com.example.mvvmnewsapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mvvmnewsapp.ui.viewmodel.NewsViewModel
import com.example.mvvmnewsapp.databinding.FragmentSavedNewsBinding
import com.example.mvvmnewsapp.ui.NewsActivity

class SavedNewsFragment : Fragment() {

    private lateinit var binding: FragmentSavedNewsBinding
    lateinit var viewModel: NewsViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSavedNewsBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel

    }

}