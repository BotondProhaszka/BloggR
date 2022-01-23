package hu.bme.aut.bloggr.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import hu.bme.aut.bloggr.databinding.TagViewBinding
import hu.bme.aut.bloggr.model.Tag


class TagAdapter(private val listener: TagClickListener) :
    RecyclerView.Adapter<TagAdapter.TagViewHolder>(){

    private val items = mutableListOf<Tag>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = TagViewHolder(
        TagViewBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: TagViewHolder, position: Int) {
        val tag = items[position]
        holder.binding.tvTag.text = tag.name
    }

    override fun getItemCount(): Int = items.size



        interface TagClickListener{
            fun onTagClicked(tag: Tag)
        }

    inner class TagViewHolder(val binding: TagViewBinding) : RecyclerView.ViewHolder(binding.root)
}
