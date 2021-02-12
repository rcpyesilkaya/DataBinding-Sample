package com.recepyesilkaya.databinding_sample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.recepyesilkaya.databinding_sample.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
    }
}