package com.java.external.Airconditioner;

import com.java.internal.Fork;

public class GoldFork {
    public void goldFork(Fork fork) {
        if (fork != null) {
            fork.use();

            if (fork instanceof SilverFork) {
                SilverFork silverFork = (SilverFork) fork;
                silverFork.clean();
            } else {
                System.err.println("This is not gold fork.");
            }
        } else {
            System.err.println("not a fork.");
        }
    }
}
