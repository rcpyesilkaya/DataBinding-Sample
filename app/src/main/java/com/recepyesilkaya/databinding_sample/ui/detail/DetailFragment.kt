package com.recepyesilkaya.databinding_sample.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.recepyesilkaya.databinding_sample.R
import com.recepyesilkaya.databinding_sample.data.mock.Mock
import com.recepyesilkaya.databinding_sample.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {

    private lateinit var detailBinding: FragmentDetailBinding
    private val detailViewModel: DetailViewModel by lazy {
        ViewModelProvider(this).get(DetailViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        detailBinding = FragmentDetailBinding.inflate(inflater, container, false)
        return detailBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        detailBinding.lifecycleOwner = viewLifecycleOwner
        detailBinding.viewModel = detailViewModel

        var productId = 0
        arguments?.let {
            productId = DetailFragmentArgs.fromBundle(it).id
        }
        detailViewModel.market = Mock.getMarkets().find { it.id == productId }!!
        detailViewModel.minusCount()
    }
}