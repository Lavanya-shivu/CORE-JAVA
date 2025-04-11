package com.java.external.Airconditioner;

import com.java.internal.Birthday;

public class SurpriseBirthday extends Birthday {
    public SurpriseBirthday() {
        System.out.println("No-argument constructor in SurpriseBirthday");
    }

    public void decorate() {
        System.out.println("Room decorated with balloons and lights!");
    }

    public void cakeCutting() {
        System.out.println("Cutting the delicious birthday cake!");
    }

    public void cakeCutting(Birthday birthday) {
        if (birthday != null) {
            System.out.println("Birthday celebration includes cake cutting!");
        } else {
            System.out.println("No birthday to celebrate.");
        }
    }
}
