package ananabillarizky.muhardanie.uas_ppb_ananabillarm

import ananabillarizky.muhardanie.uas_ppb_ananabillarm.databinding.CardItemBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView


class CardViewHolder (
    private val cardItemBinding: CardItemBinding,
    private val clickListener: ProdukClickListener
) : RecyclerView.ViewHolder(cardItemBinding.root)
{
    fun bindProduk(produk:Produk){
        cardItemBinding.cover.setImageResource(produk.cover)
        cardItemBinding.title.text = produk.title

        cardItemBinding.cardView.setOnClickListener {
            clickListener.onClick(produk)
        }
    }
}