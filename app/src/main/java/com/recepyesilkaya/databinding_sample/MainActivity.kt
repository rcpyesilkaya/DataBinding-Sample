package com.recepyesilkaya.databinding_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.recepyesilkaya.databinding_sample.data.model.Market
import com.recepyesilkaya.databinding_sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activityMainBinding.market = Market(1, "Televizyon", "Elektronik", 2500, 10, "https://blog.recognize.im/wp-content/uploads/2013/03/TV.png")

        /*val tvName: TextView = findViewById(R.id.tvName)
        val tvCategory: TextView = findViewById(R.id.tvCategory)
        val tvPrice: TextView = findViewById(R.id.tvPrice)
        val tvCount: TextView = findViewById(R.id.tvCount)
        val market = Market(1, "Televizyon", "Elektronik", 2500, 10, null)
        tvName.text = market.name
        tvCategory.text = market.category
        tvPrice.text = market.price.toString()
        tvCount.text = market.count.toString()*/

    }
}