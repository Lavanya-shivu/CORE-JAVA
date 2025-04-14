package com.java.external.Airconditioner;

import com.java.internal.Alien;
import com.java.external.Airconditioner.SpaceAlien;

public class RobotAlien {
    public void communicate(Alien alien) {
        if (alien != null) {
            if (alien instanceof SpaceAlien) {
                SpaceAlien spaceAlien = (SpaceAlien) alien;
                spaceAlien.abduct();
                spaceAlien.teleport();
            } else {
                alien.communicate();
                System.err.println("Alien is not a SpaceAlien.");
            }
        } else {
            System.err.println("Alien is null");
        }
    }
}
