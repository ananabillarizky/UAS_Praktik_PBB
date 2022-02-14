package ananabillarizky.muhardanie.uas_ppb_ananabillarm

import ananabillarizky.muhardanie.uas_ppb_ananabillarm.databinding.ActivityHomeBinding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType
import com.smarteist.autoimageslider.SliderAnimations
import com.smarteist.autoimageslider.SliderView

class Home : AppCompatActivity() , ProdukClickListener {
    var sliderView: SliderView? = null
    var images = intArrayOf(
        R.drawable.bener1,
        R.drawable.bener2,
        R.drawable.bener3
    )
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sliderView = findViewById(R.id.image_slider)
        val sliderAdapter = SliderAdapter(images)
        sliderView?.setSliderAdapter(sliderAdapter)
        sliderView?.setIndicatorAnimation(IndicatorAnimationType.WORM)
        sliderView?.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION)
        sliderView?.startAutoCycle()

        populateProduks()

        val homeActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext,2)
            adapter = CardAdapter(produkList,homeActivity)
        }
    }

    override fun onClick(produk: Produk) {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(PRODUK_ID_EXTRA,produk.id)
        startActivity(intent)
    }

    private fun populateProduks() {
        val produk1 = Produk(
            R.drawable.skincare,
            title = "Skincare",
            description = "Disini Produk Skincare"
        )
        produkList.add(produk1)

        val produk2 = Produk(
            R.drawable.bodycare,
            title = "BodyCare",
            description = "Disini Produk Bodycare"
        )
        produkList.add(produk2)

        val produk3 = Produk(
            R.drawable.haircare,
            title = "HairCare",
            description = "Disini Produk Haicare"
        )
        produkList.add(produk3)


        val produk4 = Produk(
            R.drawable.makeup,
            title = "MakeUp",
            description = "Disini Produk MakeUp"
        )

        produkList.add(produk4)


    }


}