package ananabillarizky.muhardanie.uas_ppb_ananabillarm

var produkList = mutableListOf<Produk>()

val PRODUK_ID_EXTRA = "produkExtra"

class Produk (
    var cover: Int,
    var title: String,
    var description: String,
    val id: Int? = produkList.size

)