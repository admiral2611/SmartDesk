package com.admiral26.smartdesk.ui.splash_and_onboarding_screens.onboard

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.smartdesk.R
import com.admiral26.smartdesk.databinding.Screen5OnboardBinding
import com.admiral26.smartdesk.ui.base.BaseFragment

class OnBoardScreen5 : BaseFragment(R.layout.screen5_onboard) {
    private val binding by viewBinding(Screen5OnboardBinding::bind)
    private val viewModelImp: OnBoardViewModel by viewModels<OnBoardViewModelImp>()
    override fun onBaseViewCreated(view: View, savedInstanceState: Bundle?) {
        listener()
    }

    private fun listener() {
        binding.signInBtn.setOnClickListener {

        }
        binding.registerBtn.setOnClickListener {

        }
    }

}