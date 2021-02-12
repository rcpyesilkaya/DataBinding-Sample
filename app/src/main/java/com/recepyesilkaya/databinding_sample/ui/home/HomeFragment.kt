package com.recepyesilkaya.databinding_sample.ui.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.recepyesilkaya.databinding_sample.R
import com.recepyesilkaya.databinding_sample.data.mock.Mock
import com.recepyesilkaya.databinding_sample.databinding.FragmentHomeBinding
import com.recepyesilkaya.databinding_sample.ui.adapter.MarketAdapter


class HomeFragment : Fragment() {
    private lateinit var fragmentHomeBinding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false)
        return fragmentHomeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentHomeBinding.lifecycleOwner = viewLifecycleOwner
        val adapter = MarketAdapter(Mock.getMarkets())
        adapter.onClickItem {
            val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment(it.id)
            findNavController().navigate(action)
        }
        fragmentHomeBinding.rvMarket.adapter = adapter
    }
}