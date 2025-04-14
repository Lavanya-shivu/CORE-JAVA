package com.java.external.Airconditioner;

import com.java.internal.Emoji;

public class SadEmoji {
    public void sademoji(Emoji emoji) {
            if (emoji != null) {
                if (emoji instanceof SmileEmoji) {
                    SmileEmoji smileEmoji = (SmileEmoji) emoji;
                    smileEmoji.react();
                    smileEmoji.animate();
                } else {
                    emoji.display();
                    System.err.println("This is a basic emoji, not a SmileEmoji.");
                }
            } else {
                System.err.println("Emoji is null.");
            }
        }
    }