package com.admiral26.smartdesk.ui.splash_and_onboarding_screens

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.admiral26.smartdesk.R
import com.admiral26.smartdesk.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
@SuppressLint("CustomSplashScreen")
class SplashScreen : BaseFragment(R.layout.splash_screen) {
    private val viewModelImp: SplashViewModel by viewModels<SplashViewModelImp>()
    override fun onBaseViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModelImp.onBoardingShown()
        viewModelImp.isOnBoardingShown.observe(viewLifecycleOwner) {
            lifecycleScope.launch {
                delay(2000)
                if (it)
                    findNavController().navigate(SplashScreenDirections.actionSplashScreenToOnboardScreen1())
                else
                    findNavController().navigate(SplashScreenDirections.actionSplashScreenToMainScreen())
            }
        }
    }
}

