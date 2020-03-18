package com.harish.exercise.feeds

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.harish.exercise.R
import com.harish.exercise.model.Item
import com.squareup.picasso.Picasso


class RecyclerAdapter(var list: List<Item>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_items, parent, false)
        return ViewHolder(view)
    }

    fun updateList(list: List<Item>) {
        this.list = list
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val row = list.get(position)
        if(row.title != null) holder.title!!.setText(row.title)
        else holder.title!!.setText("N/A")
        Picasso.get()
            .load(row.pagemap?.cseImage?.get(0)?.src).placeholder(R.drawable.placeholder)
            .into(holder.image)
    }

    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var title: TextView? = null
        var disc: TextView? = null
        var image: ImageView? = null

        init {
            title = v.findViewById(R.id.title)
            disc = v.findViewById(R.id.disc)
            image = v.findViewById(R.id.image)
        }
    }

}