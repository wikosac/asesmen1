package org.d3if4401.asesmen1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.d3if4401.asesmen1.databinding.ItemViewBinding

class MainAdapter(private val data: List<Item>) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    class ViewHolder(private val binding: ItemViewBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Item) = with(binding) {
            namaTextView.text = item.nama
            imageView.setImageResource(item.imageResId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemViewBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

}