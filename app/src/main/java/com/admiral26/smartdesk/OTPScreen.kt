package com.admiral26.smartdesk

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.smartdesk.databinding.ScreenOTPBinding
import com.admiral26.smartdesk.ui.base.BaseFragment

class OTPScreen : BaseFragment(R.layout.screen_o_t_p) {
    private val binding by viewBinding(ScreenOTPBinding::bind)
    override fun onBaseViewCreated(view: View, savedInstanceState: Bundle?) {

    }
}