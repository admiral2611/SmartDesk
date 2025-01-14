package com.admiral26.smartdesk.ui.splash_and_onboarding_screens.onboard

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.smartdesk.R
import com.admiral26.smartdesk.databinding.Screen1OnboardBinding
import com.admiral26.smartdesk.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OnboardScreen1 : BaseFragment(R.layout.screen1_onboard) {
    private val binding by viewBinding(Screen1OnboardBinding::bind)

    override fun onBaseViewCreated(view: View, savedInstanceState: Bundle?) {
        listener()
    }

    private fun listener() {
        binding.skip1Button1.setOnClickListener {
            findNavController().navigate(OnboardScreen1Directions.actionOnboardScreen1ToMainScreen())
        }
        binding.next1Button1.setOnClickListener {
            findNavController().navigate(OnboardScreen1Directions.actionOnboardScreen1ToOnboardScreen2(2))

        }
    }
}