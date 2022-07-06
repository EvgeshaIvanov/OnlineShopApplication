package com.example.phoneshopapp.mainScreen.presentation

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.cardview.widget.CardView
import com.example.phoneshopapp.R
import com.example.phoneshopapp.databinding.ItemFromMenuBinding



typealias OnViewClickListener = ()-> Unit



class SelectView(
    context: Context,
    attrs: AttributeSet?,
    defStyleAttr: Int,
) : CardView(context, attrs, defStyleAttr) {
    private var listener: OnViewClickListener? = null
    private val binding: ItemFromMenuBinding

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context) : this(context, null)

    init {
        val inflater = LayoutInflater.from(context)
        inflater.inflate(R.layout.item_from_menu, this, true)
        binding = ItemFromMenuBinding.bind(this)
        initializeAttributes(attrs, defStyleAttr)
        initListener()
    }


    private fun initializeAttributes(attrs: AttributeSet?, defStyleAttr: Int) {
        if (attrs == null) return
        val typedArray =
            context.obtainStyledAttributes(attrs, R.styleable.SelectView, defStyleAttr, 0)

        with(binding) {
            val itemText = typedArray.getString(R.styleable.SelectView_itemText)
            selectTextView.text = itemText ?: "Example"

            val colorItemText =
                typedArray.getColor(R.styleable.SelectView_colorItemText, Color.GREEN)
            selectTextView.setTextColor(colorItemText)

            val srcItem = typedArray.getDrawable(R.styleable.SelectView_srcItem)
            imageView.setImageDrawable(srcItem)

            val colorItemView =
                typedArray.getColor(R.styleable.SelectView_ovalColor, Color.parseColor("#010035"))
            selectColorView.backgroundTintList = ColorStateList.valueOf(colorItemView)

            val isSelected = typedArray.getBoolean(R.styleable.SelectView_isSelected, false)
            if (isSelected) {
                selectTextView.setTextColor(Color.parseColor("#FF6E4E"))
                selectColorView.backgroundTintList =
                    ColorStateList.valueOf(Color.parseColor("#FF6E4E"))
            } else {
                selectTextView.setTextColor(colorItemText)
                selectColorView.backgroundTintList = ColorStateList.valueOf(colorItemView)
            }
//            val isSelected = typedArray.getBoolean(R.styleable.SelectView_isSelected, false)
//            if (isSelected) {
//                selectColorView.backgroundTintList = ColorStateList.valueOf(R.color.orange)
//                selectTextView.setTextColor(R.color.orange)
//            } else {
//                selectColorView.backgroundTintList = ColorStateList.valueOf(R.color.white)
//                selectTextView.setTextColor(colorItemText)
//            }
        }

        typedArray.recycle()
    }

    private fun initListener(){
        binding.imageView.setOnClickListener {
            this.listener?.invoke()
        }

    }

    fun setListener(listener: OnViewClickListener?) {
        this.listener = listener
    }

}