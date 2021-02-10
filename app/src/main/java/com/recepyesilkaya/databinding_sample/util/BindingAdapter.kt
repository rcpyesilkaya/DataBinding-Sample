package com.recepyesilkaya.databinding_sample.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.request.RequestOptions
import com.recepyesilkaya.databinding_sample.R

@BindingAdapter("loadImage")
fun ImageView.loadImage(url: String?) {
    if (!url.isNullOrEmpty()) {
        val circularProgressDrawable = CircularProgressDrawable(context).apply {
            strokeWidth = 8f
            centerRadius = 40f
            start()
        }
        val options = RequestOptions()
            .placeholder(circularProgressDrawable)
            .error(R.mipmap.ic_launcher_round)

        Glide.with(context)
            .setDefaultRequestOptions(options)
            .load(url).into(this)
        return
    }
    this.background=resources.getDrawable(R.mipmap.ic_launcher_round)
}