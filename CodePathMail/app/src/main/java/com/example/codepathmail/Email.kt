package com.example.codepathmail

import android.media.Image

class Email(
    val sender: String,
    val title: String,
    val summary: String,
    val date: String,
    val pic: Int = R.drawable.face,
    var isRead: Boolean = false
)