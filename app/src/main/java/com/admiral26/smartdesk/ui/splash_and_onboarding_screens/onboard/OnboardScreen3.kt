package com.admiral26.smartdesk.ui.splash_and_onboarding_screens.onboard

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.smartdesk.R
import com.admiral26.smartdesk.databinding.Screen3OnboardBinding
import com.admiral26.smartdesk.ui.base.BaseFragment

class OnboardScreen3 : BaseFragment(R.layout.screen3_onboard) {
    private val args: OnboardScreen3Args by navArgs()
    private val binding by viewBinding(Screen3OnboardBinding::bind)
    override fun onBaseViewCreated(view: View, savedInstanceState: Bundle?) {
        listener()
    }

    private fun listener() {
        binding.skip3Button3.setOnClickListener {
            findNavController().navigate(OnboardScreen3Directions.actionOnboardScreen3ToMainScreen())

        }
        binding.next3Button3.setOnClickListener {
            findNavController().navigate(
                OnboardScreen3Directions.actionOnboardScreen3ToOnboardScreen4(
                    4
                )
            )
        }
        binding.progressBar3.progress = args.progressNum
    }
}