package com.ydnm4528.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ydnm4528.recyclerview.adapter.FlowerAdapter
import com.ydnm4528.recyclerview.model.Flower
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var flowerList = ArrayList<Flower>()
        flowerList.add(Flower("Rose", 1.2, R.drawable.f1))
        flowerList.add(Flower("Daisy", 1.3, R.drawable.f2))

        var flowerAdapter = FlowerAdapter(flowerList)
        flowerRecycler.layoutManager = LinearLayoutManager(this)
        flowerRecycler.adapter = flowerAdapter
    }
}