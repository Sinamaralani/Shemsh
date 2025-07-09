package com.example.shemsh.asset

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.shemsh.databinding.FragmentAssetBinding

class AssetFragment : Fragment() {

    private lateinit var binding: FragmentAssetBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAssetBinding.inflate(inflater, container, false)
        return binding.root
    }

}