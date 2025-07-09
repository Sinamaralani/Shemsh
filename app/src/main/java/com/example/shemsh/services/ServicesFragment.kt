package com.example.shemsh.services

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.shemsh.R
import com.example.shemsh.databinding.FragmentServicesBinding

class ServicesFragment : Fragment() {

    private lateinit var binding: FragmentServicesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentServicesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buyGoldBtn.setOnClickListener {
            findNavController().navigate(R.id.action_servicesFragment_to_buyGoldFragment)
        }
    }


}