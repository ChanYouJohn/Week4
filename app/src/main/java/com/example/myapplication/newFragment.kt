package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.myapplication.databinding.FragmentNewBinding


class newFragment : Fragment() {

    private lateinit var binding: FragmentNewBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_new, container, false)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_new, container, false)

        binding.homeButton.setOnClickListener(){
            Navigation.findNavController(binding.root).popBackStack()
        }
        return binding.root
    }

}