package com.java.external.badge;

import com.java.internal.Badge.NCC;

public class BadgeRunner {
    public static void main(String[] args) {
        NCC ncc = new NCC();
        ncc.badgeNCC();

        Uniform uniform = new Uniform();
        uniform.nccUniform();
    }
}
