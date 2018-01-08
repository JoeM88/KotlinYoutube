package com.example.josephmolina.kotlinyoutube

/**
 * Created by josephmolina on 1/7/18.
 */
class HomeFeed(val videos: List<Video>)

class Video(val id: Int, val name: String, val link:String, val imageUrl:String,
            numberOfViews: Int, val channel: Channel)

class Channel(val name: String, val profileImageUrl: String)