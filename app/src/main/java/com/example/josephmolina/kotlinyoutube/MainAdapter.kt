package com.example.josephmolina.kotlinyoutube

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.video_row.view.*

/**
 * Created by josephmolina on 1/7/18.
 */
class MainAdapter(val homeFeed: HomeFeed) : RecyclerView.Adapter<CustomViewHolder>() {

    override fun getItemCount(): Int {
        return homeFeed.videos.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.video_row, parent, false)
        return CustomViewHolder(cellForRow)

    }

    override fun onBindViewHolder(holder: CustomViewHolder?, position: Int) {
        val video = homeFeed.videos.get(position)
        holder?.view?.textView_video_title?.text = video.name
        holder?.view?.textView_channel_name?.text = video.channel.name

        val thumbnailImageView = holder?.view?.thumbnailImageView
        Picasso.with(holder?.view?.context).load(video.imageUrl).into(thumbnailImageView)

        val channelProfileImageView = holder?.view?.imageView_channel_profile
        Picasso.with(holder?.view?.context).load(video.channel.profileImageUrl).into(channelProfileImageView)

    }
}

class CustomViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    init {
        view.setOnClickListener {
            println("TEST")
            val intent = Intent(view.context, CourseDetailActivity::class.java)
            view.context.startActivity(intent)
        }
    }
}