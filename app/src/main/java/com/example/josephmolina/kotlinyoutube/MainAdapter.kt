package com.example.josephmolina.kotlinyoutube

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.video_row.view.*

/**
 * Created by josephmolina on 1/7/18.
 */
class MainAdapter : RecyclerView.Adapter<CustomViewHolder>() {

    override fun getItemCount(): Int {
        return 3
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.video_row, parent, false)
        return CustomViewHolder(cellForRow)

    }

    override fun onBindViewHolder(holder: CustomViewHolder?, position: Int) {
        holder?.view?.textView_video_title?.text = "123"
    }
}

class CustomViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

}