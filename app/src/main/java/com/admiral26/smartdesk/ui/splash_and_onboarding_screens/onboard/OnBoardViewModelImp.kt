package com.admiral26.smartdesk.ui.splash_and_onboarding_screens.onboard

import androidx.lifecycle.ViewModel
import com.admiral26.smartdesk.core.cache.LocalStorage
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class OnBoardViewModelImp @Inject constructor(private val localStorage: LocalStorage) :
    OnBoardViewModel, ViewModel() {
    override fun temp() {
        localStorage.isOnBoardingShown = false
    }
}