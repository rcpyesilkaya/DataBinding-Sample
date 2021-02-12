package com.recepyesilkaya.databinding_sample.ui.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.transition.MaterialArcMotion
import com.recepyesilkaya.databinding_sample.R
import com.recepyesilkaya.databinding_sample.data.model.Market
import com.recepyesilkaya.databinding_sample.databinding.ItemMarketBinding
import com.recepyesilkaya.databinding_sample.ui.home.MarketItemViewState

class MarketAdapter(private val markets: ArrayList<Market>) :
    RecyclerView.Adapter<MarketAdapter.MarketViewHolder>() {

    private lateinit var onClick: (Market) -> Unit

    fun onClickItem(onClick: (Market) -> Unit) { this.onClick = onClick }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarketViewHolder {
        val itemMarketBinding: ItemMarketBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_market, parent, false)
        return MarketViewHolder(itemMarketBinding)
    }
    override fun onBindViewHolder(holder: MarketViewHolder, position: Int) {
        holder.bind(markets[position], onClick)
    }

    override fun getItemCount(): Int = markets.size

    class MarketViewHolder(private val binding: ItemMarketBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(market: Market, onClick: (Market) -> Unit) {
            binding.viewState= MarketItemViewState(market)
            binding.root.setOnClickListener {
                onClick.invoke(market)
            }
        }
    }
}