package com.admiral26.smartdesk.ui.splash_and_onboarding_screens.onboard

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.smartdesk.R
import com.admiral26.smartdesk.databinding.Screen4OnboardBinding
import com.admiral26.smartdesk.ui.base.BaseFragment

class OnboardScreen4 : BaseFragment(R.layout.screen4_onboard) {
    private val args: OnboardScreen4Args by navArgs()
    private val binding by viewBinding(Screen4OnboardBinding::bind)
    private val viewModelImp: OnBoardViewModel by viewModels<OnBoardViewModelImp>()
    override fun onBaseViewCreated(view: View, savedInstanceState: Bundle?) {
        listener()
    }

    private fun listener() {
        binding.next4Button4.setOnClickListener {
            findNavController().navigate(OnboardScreen4Directions.actionOnboardScreen4ToMainScreen())
            viewModelImp.temp()
        }
    }

}