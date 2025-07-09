package com.example.shemsh.services

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.shemsh.R
import com.example.shemsh.databinding.FragmentBuyGoldBinding

class BuyGoldFragment : Fragment() {

    private lateinit var binding: FragmentBuyGoldBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBuyGoldBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.topbar.setNavigationOnClickListener {
            findNavController().navigateUp()
        }

//        val builder =
//            AlertDialog.Builder(requireContext()).setView(R.layout.buy_gold_dialog).create()
//
//        binding.info.setOnClickListener {
//            builder.show()
//        }

        val editTextMoney = binding.etBuyGold
        val editTextGold = binding.etSellGold

        val sutPrice = 70000

        editTextMoney.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(
                s: CharSequence?,
                start: Int,
                count: Int,
                after: Int
            ) {}

            override fun onTextChanged(
                s: CharSequence?,
                start: Int,
                before: Int,
                count: Int
            ) {}

            override fun afterTextChanged(s: Editable?) {
                val moneyInput = s.toString().toDoubleOrNull()
                if (moneyInput != null && sutPrice > 0) {
                    val sutAMount = moneyInput / sutPrice
                    editTextGold.setText(String.format("%.2f", sutAMount))
                } else editTextMoney.setText("")
            }
        })
    }

}