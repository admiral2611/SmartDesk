package com.admiral26.smartdesk.core.cache

import android.content.Context
import com.admiral26.smartdesk.core.utils.BooleanPreference
import javax.inject.Singleton

@Singleton
class LocalStorage(context: Context) {
    private val KEY = "SDAFASFD24534T2EGFDSD3OI4JFirjgiejsaweffEPOIJEF0394TGJPEOIWJ"
    private val smartDeckKey = "SMARTDECK_KEY"
    private val securePref = context.getSharedPreferences("shared_cache", Context.MODE_PRIVATE)

    var isOnBoardingShown: Boolean by BooleanPreference(securePref, true)


}