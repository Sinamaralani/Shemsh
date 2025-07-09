package com.example.shemsh.transAction

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.shemsh.R
import com.example.shemsh.databinding.FragmentTransActionsBinding

class TransActionsFragment : Fragment() {

    private lateinit var binding: FragmentTransActionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTransActionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.chipGroup.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.everything_chip -> {
                    binding.infoTv.text = "تراکنشی برای نمایش وجود ندارد."
                    binding.infoIv.setImageResource(R.drawable.empty_status)
                }

                R.id.diposit_chip -> {
                    binding.infoTv.text = "تاکنون واریزی\u200Cای انجام ندادید."
                    binding.infoIv.setImageResource(R.drawable.depositfundstowallet)
                }

                R.id.pickedUp_chip -> {
                    binding.infoTv.text = "تاکنون برداشتی نداشته\u200Cاید."
                    binding.infoIv.setImageResource(R.drawable.wallet_empty_b37fccce)
                }

                R.id.buyGold_chip -> {
                    binding.infoTv.text = "تاکنون طلایی خریداری نکرده\u200Cاید."
                    binding.infoIv.setImageResource(R.drawable.buygold)
                }

                R.id.sellGold_chip -> {
                    binding.infoTv.text = "تاکنون طلایی نفروخته\u200Cاید."
                    binding.infoIv.setImageResource(R.drawable.sellgold)
                }

                R.id.getGold_chip -> {
                    binding.infoTv.text = "تاکنون به شما طلایی انتقال داده نشده"
                    binding.infoIv.setImageResource(R.drawable.recievegold)
                }

                R.id.physical -> {
                    binding.infoTv.text = "تاکنون به شما طلایی انتقال داده نشده"
                    binding.infoIv.setImageResource(R.drawable.empty_installment)
                }

                R.id.goldToGold_chip -> {
                    binding.infoTv.text = "تاکنون طلایی انتقال نداده\u200Cاید."
                    binding.infoIv.setImageResource(R.drawable.transfergold)
                }

                R.id.installments_chip -> {
                    binding.infoTv.text = "تاکنون خرید طلا اقساطی نداشته\u200Cاید."
                    binding.infoIv.setImageResource(R.drawable.empty_installment)
                }

                R.id.giftCard_chip -> {
                    binding.infoTv.text = "تاکنون کارت هدیه ای دریافت نکرده\u200Cاید."
                    binding.infoIv.setImageResource(R.drawable.gift_card_empty)
                }

                R.id.reward_chip -> {
                    binding.infoTv.text = "تاکنون پاداشی دریافت نکرده\u200Cاید."
                    binding.infoIv.setImageResource(R.drawable.invitationreward)
                }

                else -> ""
            }

        }
    }
}