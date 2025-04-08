package com.java.external.mutant;

import com.java.internal.mutant.MutantTracker;

public class MutantRunner {
    public static void main(String[] args) {
        MutantTracker tracker = new MutantTracker();
        tracker.trackMutant();

        MutantResearch research = new MutantResearch();
        research.studyMutant();
    }
}
