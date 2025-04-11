package com.java.runner;

import com.java.external.Airconditioner.FunnyGif;

public class GifRunner {
    public static void main(String[] args) {
        FunnyGif gif = new FunnyGif();
        gif.load();
        System.out.println("--------------------------");

        gif.loop();
        gif.animate();
        gif.animate(gif);
        gif.animate(null);
        System.out.println("==========================");
    }
}
