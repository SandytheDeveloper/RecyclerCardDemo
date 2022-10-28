package com.myfirstapp.recyclercarddemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var rv: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rv=findViewById(R.id.rv1)

        var lm=LinearLayoutManager(this)
        rv.layoutManager=lm

        var ad=MyAdapter()
        rv.adapter=ad

    }
}