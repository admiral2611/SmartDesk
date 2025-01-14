package com.admiral26.smartdesk.ui.splash_and_onboarding_screens.onboard

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.smartdesk.R
import com.admiral26.smartdesk.databinding.Screen2OnboardBinding
import com.admiral26.smartdesk.ui.base.BaseFragment

class OnboardScreen2 : BaseFragment(R.layout.screen2_onboard) {
    private val args: OnboardScreen2Args by navArgs()
    private val binding by viewBinding(Screen2OnboardBinding::bind)
    override fun onBaseViewCreated(view: View, savedInstanceState: Bundle?) {
        listener()
    }

    private fun listener() {
        binding.skip2Button2.setOnClickListener {
            findNavController().navigate(OnboardScreen2Directions.actionOnboardScreen2ToMainScreen())
        }
        binding.next2Button2.setOnClickListener {
            findNavController().navigate(OnboardScreen2Directions.actionOnboardScreen2ToOnboardScreen3(3))
        }

        binding.progressBar2.progress=args.progressNum
    }

}