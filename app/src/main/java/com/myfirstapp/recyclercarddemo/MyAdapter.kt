package com.myfirstapp.recyclercarddemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import java.util.zip.Inflater

class MyAdapter:RecyclerView.Adapter<MyAdapter.ViewHolder>()
{

    var t= arrayOf("Asus","Samsung","lenovo","Dell","HP","Victus","Mac")
    var st= arrayOf("120k","56k","69k","56k","90k","129k","250k")
    var i= arrayOf(R.drawable.lap1,R.drawable.lap2,R.drawable.lap3,R.drawable.lap4,R.drawable.lap5,R.drawable.lap6,R.drawable.lap7,)

    inner class ViewHolder(iview:View):RecyclerView.ViewHolder(iview)
    {
        lateinit var tv1:TextView
        lateinit var tv2:TextView
        lateinit var img:ImageView


        init {

            tv1=iview.findViewById(R.id.tvtitle)
            tv2=iview.findViewById(R.id.tvstitle)
            img=iview.findViewById(R.id.tvimg)


            iview.setOnClickListener {

                Snackbar.make(iview,tv1.text.toString(),Snackbar.LENGTH_SHORT).show()

            }


        }



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        var v=LayoutInflater.from(parent.context)
        .inflate(R.layout.card_view,parent,false)

        return ViewHolder(v)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.tv1.text=t[position]
        holder.tv2.text=st[position]
        holder.img.setImageResource(i[position])

    }

    override fun getItemCount(): Int {



        return t.size
    }

}