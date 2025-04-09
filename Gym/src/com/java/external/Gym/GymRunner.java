package com.java.external.Gym;
import com.java.HealthInspector;
import com.java.internal.Gym.Trainer;

public class GymRunner {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        trainer.manageGym();

        HealthInspector inspector = new HealthInspector();
        inspector.inspectGym();
    }
}
