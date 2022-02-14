package ananabillarizky.muhardanie.uas_ppb_ananabillarm

import ananabillarizky.muhardanie.uas_ppb_ananabillarm.databinding.CardItemBinding
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView



class CardAdapter (private val produks: List<Produk>,
                   private val clickListener: ProdukClickListener
)
    : RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardItemBinding.inflate(from,parent,false)
        return CardViewHolder(binding,clickListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindProduk(produks[position])
    }

    override fun getItemCount(): Int = produks.size
}