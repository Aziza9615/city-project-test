package com.example.citysproject.city

import android.app.Activity
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.citysproject.R
import com.example.citysproject.data.model.City
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYou
import kotlinx.android.synthetic.main.item_adapter.view.*

class CityAdapter(private val listener: ClickListener, private val activity: Activity) :
        RecyclerView.Adapter<CityAdapter.BaseViewHolder>() {
    interface ClickListener {
        fun onItemClick(item: City)
    }

    var items = mutableListOf<City>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return if (viewType == VIEW_TYPE_DATA) CityViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_adapter, parent, false)
        )else EmptyViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_empty, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return if (items.count() == 0) 1
        else items.count()
    }

    override fun getItemViewType(position: Int): Int {
        return if (items.count() == 0) VIEW_TYPE_EMPTY
        else VIEW_TYPE_DATA
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        val type = getItemViewType(position)
        if (type == VIEW_TYPE_DATA) setupCityViewHolder(holder as CityViewHolder, position)
    }

    private fun setupCityViewHolder(holder: CityViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item, activity)
        holder.itemView.setOnLongClickListener {
            listener.onItemClick(item)
            true
        }
    }

    fun addItems(items: MutableList<City>) {
        this.items = items
        notifyDataSetChanged()
    }

    companion object {
        val VIEW_TYPE_DATA = 1
        val VIEW_TYPE_EMPTY = 2
    }

    open class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    class CityViewHolder(itemView: View) : BaseViewHolder(itemView) {
        fun bind(item: City, activity: Activity) {
            GlideToVectorYou.init().with(itemView.context).load(Uri.parse(item.flag), itemView.flag_iv)
            itemView.country_tv.text = item.country
            itemView.capital_tv.text = item.capital
        }
    }

    class EmptyViewHolder(itemView: View) : BaseViewHolder(itemView) {}
}
