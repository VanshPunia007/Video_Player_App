package com.punia.videoplayer

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView = findViewById<VideoView>(R.id.videoView)
        // Creating Media Controller
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        // Specify the location of media file
        val uri: Uri = Uri.parse(
            "android.resource://" + packageName + "/raw/sang_maar_gyi"
        )
        videoView.setVideoURI(uri)
        videoView.setMediaController(mediaController)
        videoView.requestFocus()
        videoView.start()
    }
}