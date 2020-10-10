package com.imtiaz.mynavigationcomponent.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.imtiaz.mynavigationcomponent.data.Player
import com.imtiaz.mynavigationcomponent.databinding.ItemPlayerBinding

class PlayerListAdapter(
    val context: Context,
    var playerList: List<Player>,
    val onClick: (Int) -> Unit
) :
    RecyclerView.Adapter<PlayerListAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
        MyViewHolder(ItemPlayerBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun getItemCount(): Int = playerList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) = holder.bind(
        playerList.get(
            position
        )
    )

    inner class MyViewHolder(binding: ItemPlayerBinding) : RecyclerView.ViewHolder(binding.root) {

        private val _binding: ItemPlayerBinding

        init {
            _binding = binding
        }

        fun bind(player: Player){

            _binding.apply {

                val resID: Int = context.resources.getIdentifier(
                    player.drawable,
                    "drawable", context.packageName
                )

                val drawable = ContextCompat.getDrawable(context, resID)
                ivGallery.setImageDrawable(drawable)
            }
        }
    }
}