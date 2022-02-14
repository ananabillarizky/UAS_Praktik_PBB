package ananabillarizky.muhardanie.uas_ppb_ananabillarm

import ananabillarizky.muhardanie.uas_ppb_ananabillarm.databinding.ActivityDetailBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val produkID = intent.getIntExtra(PRODUK_ID_EXTRA, -1)
        val produk = produkFromID(produkID)
        if(produk != null){
            binding.cover.setImageResource(produk.cover)
            binding.title.text = produk.title
            binding.description.text = produk.description
        }

        binding.backButton.setOnClickListener {
            onBackPressed()
        }
    }

    private fun produkFromID(produkID: Int): Produk? {
        for(produk in produkList)
        {
            if(produk.id == produkID)
                return produk
        }
        return null
    }
}