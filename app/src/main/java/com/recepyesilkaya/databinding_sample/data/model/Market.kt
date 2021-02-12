package com.recepyesilkaya.databinding_sample.data.model

data class Market(
    val id: Int,
    val name: String,
    val category: String,
    val price: Int,
    var count: Int,
    val image: String
)