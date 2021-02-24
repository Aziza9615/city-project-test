package com.example.citysproject.city

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.citysproject.R
import com.example.citysproject.model.City
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYou
import kotlinx.android.synthetic.main.item_adapter.view.*

class CityAdapter: RecyclerView.Adapter<CityViewHolder>() {
    interface ClickListener {
    }

    var array = mutableListOf<City>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        return CityViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_adapter, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return array.size
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        val item = array[position]
        holder.bind(item)
    }

    fun addItems(item: MutableList<City>){
        array = item
        notifyDataSetChanged()
    }
}

class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(item: City){
        GlideToVectorYou.init().with(itemView.context).load(Uri.parse(item.flag), itemView.flag_iv)
        itemView.country_tv.text = item.country
        itemView.capital_tv.text = item.capital
    }
}
