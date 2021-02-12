package com.recepyesilkaya.databinding_sample.ui.home

import android.graphics.Color
import com.recepyesilkaya.databinding_sample.data.model.Market

data class MarketItemViewState(private val market: Market) {

    fun isDiscountColor(isText:Boolean): Int {
        return if (market.count < 10) {
            if (isText) Color.parseColor("#E81216")
            else Color.parseColor("#5DDDA8")
        } else if (isText) Color.parseColor("#071316")
        else Color.parseColor("#FFFFFF")
    }

    fun name(): String = market.name ?: ""

    fun price(): String {
        return if (market.count < 10) "%50 indirim  ${market.price / 2} TL"
        else "${market.price} TL"
    }

    fun image() = market.image ?: ""
}