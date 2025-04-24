package com.java.runner;

import com.java.external.VideoPlayer;
import com.java.internal.AudioPlayer;
import com.java.internal.MediaPlayer;

public class MediaRunner {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioPlayer();
        VideoPlayer videoPlayer = new VideoPlayer(mediaPlayer);
        videoPlayer.video();
    }
}
