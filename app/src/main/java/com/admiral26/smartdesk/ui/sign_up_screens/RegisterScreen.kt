package com.admiral26.smartdesk.ui.sign_up_screens

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.smartdesk.R
import com.admiral26.smartdesk.databinding.ScreenRegisterBinding
import com.admiral26.smartdesk.ui.base.BaseFragment

class RegisterScreen : BaseFragment(R.layout.screen_register) {
    private val binding by viewBinding(ScreenRegisterBinding::bind)

    override fun onBaseViewCreated(view: View, savedInstanceState: Bundle?) {

    }

}