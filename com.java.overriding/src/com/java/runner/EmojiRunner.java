package com.java.runner;

import com.java.external.Airconditioner.SmileEmoji;

public class EmojiRunner {
    public static void main(String[] args) {
        SmileEmoji emoji = new SmileEmoji();
        emoji.display();
        System.out.println("--------------------------");

        emoji.react();
        emoji.animate();
        emoji.animate(emoji);
        emoji.animate(null);
        System.out.println("==========================");
    }
}
