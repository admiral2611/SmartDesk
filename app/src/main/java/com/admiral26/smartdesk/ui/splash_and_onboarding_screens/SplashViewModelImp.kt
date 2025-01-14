package com.admiral26.smartdesk.ui.splash_and_onboarding_screens

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.admiral26.smartdesk.core.cache.LocalStorage
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModelImp @Inject constructor(private val localStorage: LocalStorage) :
    SplashViewModel, ViewModel() {
    private val _isOnBoardingShown = MutableLiveData<Boolean>()
    override val isOnBoardingShown: LiveData<Boolean> = _isOnBoardingShown


    override fun onBoardingShown() {
        _isOnBoardingShown.value = localStorage.isOnBoardingShown
    }

}