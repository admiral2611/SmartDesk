package com.admiral26.smartdesk.core.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.admiral26.smartdesk.R
import com.admiral26.smartdesk.core.model.ItemAlgoModel
import com.admiral26.smartdesk.databinding.ItemRecyclerAlgoBinding

class MainScreenAdapter : RecyclerView.Adapter<MainScreenAdapter.ViewHolder>() {

    private var data = ArrayList<ItemAlgoModel>()

    @SuppressLint("NotifyDataSetChanged")
    fun addData(data: List<ItemAlgoModel>) {
        this.data.clear()
        this.data.addAll(data)
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: ItemRecyclerAlgoBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindData(data: ItemAlgoModel) {
            binding.titleItemAlgo.text = data.title
            binding.descriptionItemAlgo.text = data.description
            binding.difficultyItemAlgo.text = "# ${data.difficulty}"
            if (data.isBookmark) {
                binding.bookmarkItem.setImageResource(R.drawable.bookmark_true)
            } else {
                binding.bookmarkItem.setImageResource(R.drawable.bookmark_false)

            }
            binding.constraintLayoutItemAlgo.setOnClickListener {
                binding.constraintLayoutItemAlgo.animate()
                    .scaleX(0.9f)  // O‘lchamni kichraytirish
                    .scaleY(0.9f)
                    .translationZ(-10f)  // Ichkariga harakat qilish
                    .setDuration(100)
                    .withEndAction {
                        // Tugagandan keyin tiklash
                        binding.constraintLayoutItemAlgo.animate()
                            .scaleX(1f)
                            .scaleY(1f)
                            .translationZ(0f)
                            .setDuration(100)
                            .start()
                    }.start()
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MainScreenAdapter.ViewHolder {
        return ViewHolder(
            ItemRecyclerAlgoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MainScreenAdapter.ViewHolder, position: Int) {
        holder.bindData(data[position])
    }

    override fun getItemCount() = data.size

}