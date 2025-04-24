package com.java.external;

import com.java.internal.MediaPlayer;

public class VideoPlayer {
    private MediaPlayer mediaPlayer;

    public VideoPlayer(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public void video() {
        if (mediaPlayer != null) {

System.out.println("play in media player");
            this.mediaPlayer.play();
        } else {
            System.err.println("media error");
        }
    }
}