package com.admiral26.smartdesk.ui.main

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.admiral26.smartdesk.R
import com.admiral26.smartdesk.core.adapter.MainScreenAdapter
import com.admiral26.smartdesk.core.model.ItemAlgoModel
import com.admiral26.smartdesk.databinding.ScreenMainBinding
import com.admiral26.smartdesk.ui.base.BaseFragment
import com.google.android.material.appbar.AppBarLayout
import dagger.hilt.android.AndroidEntryPoint
import kotlin.math.abs

@AndroidEntryPoint
class MainScreen : BaseFragment(R.layout.screen_main) {
    private val binding by viewBinding(ScreenMainBinding::bind)
    private val adapter by lazy { MainScreenAdapter() }
    override fun onBaseViewCreated(view: View, savedInstanceState: Bundle?) {
        toolBarSet()
        faceModel()
        setAdapters()

    }


    private fun faceModel() {
        val data = ArrayList<ItemAlgoModel>()
        data.add(
            ItemAlgoModel(
                "Introduction to Programming my favorite is Kotlin",
                "Lorem ipsum dolor sit amet consectetur. Quisque  drasut  frtyhyhp hdhyunbh pellentesque nec quisque amet proin elit ",
                true,
                "medium"
            )
        )

        data.add(
            ItemAlgoModel(
                "Introduction to Programming",
                "Lorem ipsum dolor sit amet consectetur. Quisque  drasut  frtyhyhp hdhyunbh pellentesque nec quisque amet proin elit ",
                false,
                "hard"
            )
        )
        data.add(
            ItemAlgoModel(
                "Introduction to Programming",
                "Lorem ipsum dolor sit amet consectetur. Quisque  drasut  frtyhyhp hdhyunbh pellentesque nec quisque amet proin elit ",
                false,
                "easy"
            )
        )

        adapter.addData(data)

    }

    private fun toolBarSet() {
        val toolbar = binding.toolbar
        (requireActivity() as AppCompatActivity).setSupportActionBar(toolbar)
        (requireActivity() as AppCompatActivity).supportActionBar?.setDisplayShowTitleEnabled(false)
        // (requireActivity() as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(false)
        //(requireActivity() as AppCompatActivity).supportActionBar?.title = "Admiral"


        /* // ShapeAppearanceModel: faqat pastki burchaklar yumaloq bo'ladi
         val shapeAppearanceModel = ShapeAppearanceModel.builder()
             .setBottomLeftCornerSize(16f) // Pastki chap burchak radiusi
             .setBottomRightCornerSize(16f) // Pastki o'ng burchak radiusi
             .build()

         // MaterialShapeDrawable yaratish
         val materialShapeDrawable = MaterialShapeDrawable(shapeAppearanceModel)
         materialShapeDrawable.fillColor = getColorStateList(requireContext(), R.color.next_button_color) // Toolbar fon rangi

         toolbar.background = materialShapeDrawable*/


        binding.appBarLayout.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { appBarLayout, verticalOffset ->
            val totalScrollRange = appBarLayout.totalScrollRange
            if (abs(verticalOffset) == totalScrollRange) {
                // Collapsed state
                binding.userInfoLayout.visibility = View.VISIBLE
                binding.searchFilterSection.visibility = View.GONE
            } else if (verticalOffset == 0) {
                // Expanded state
                binding.userInfoLayout.visibility = View.GONE
                binding.searchFilterSection.visibility = View.VISIBLE
            } else {
                // Expanded state
                binding.userInfoLayout.visibility = View.GONE
            }
        })
    }

    private fun setAdapters() {
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager =
            LinearLayoutManager(requireActivity(), LinearLayoutManager.VERTICAL, false)
    }

}
