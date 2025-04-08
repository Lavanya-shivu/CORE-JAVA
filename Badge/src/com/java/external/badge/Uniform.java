package com.java.external.badge;

import com.java.internal.Badge.Badge;

public class Uniform {
    public void nccUniform() {
        Badge badge = new Badge();

        // Can only use public getters from different package
        System.out.println("Badge Name: " + badge.getName());
        System.out.println("Badge Color: " + badge.getColor());
        System.out.println("Badge Material: " + badge.getMaterial());
        System.out.println("Prize of the badge: " + badge.getMaterial());
        System.out.println("Is badge Vaalid: " + badge.isValid());

    }
}
