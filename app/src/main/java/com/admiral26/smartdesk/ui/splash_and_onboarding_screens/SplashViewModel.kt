package com.admiral26.smartdesk.ui.splash_and_onboarding_screens

import androidx.lifecycle.LiveData

interface SplashViewModel {
    val isOnBoardingShown: LiveData<Boolean>
    fun onBoardingShown()
}