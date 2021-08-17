package com.demirli.a23productlandingpage

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewpager: ViewPager
    private lateinit var adapter: ImageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var product = Products(
            listOf(R.drawable.image1, R.drawable.image2, R.drawable.image3),
            "Apple",
            "iPad 7. Nesil 10.2 128 GB Wifi Tablet MW782TU/A",
            "iOs",
            "2 GB",
            "2160 x 1620",
            "Retina Ekran",
            "10.2 inc",
            "Yok",
            "128 gb",
            "https://images.hepsiburada.net/assets/Bilgisayar/ProductDesc/ipad-10-a.jpg"
        )

        setUi(product)

        slide_left.setOnClickListener {
            val currentItem = viewpager.currentItem
            viewpager.setCurrentItem(currentItem-1)
        }
        slide_right.setOnClickListener {
            val currentItem = viewpager.currentItem
            viewpager.setCurrentItem(currentItem+1)
        }
    }

    fun setUi(products: Products){
        setSupportActionBar(toolbar)
        collapsingToolbarLayout.setExpandedTitleColor(Color.GRAY)
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.WHITE)

        viewpager = findViewById(R.id.viewPager)
        adapter = ImageAdapter(this, products.firstImageList)
        viewpager.adapter = adapter

        collapsingToolbarLayout.title = products.brand
        mTitle.setText(products.definement)
        operatingSystem_tv.setText(products.operatingSystem)
        ram_tv.setText(products.ram)
        maxScreenResolution_tv.setText(products.maxScreenResolution)
        displayModel_tv.setText(products.displayModel)
        screenSize_tv.setText(products.screenSize)
        mobileConnection_tv.setText(products.mobileConnection)
        internalStorage_tv.setText(products.internalStorage)
        Picasso.get().load(products.imageUri)
            .into(image1)
    }
}
