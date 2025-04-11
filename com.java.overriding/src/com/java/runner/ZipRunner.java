package com.java.runner;

import com.java.external.Airconditioner.JacketZip;

public class ZipRunner {
    public static void main(String[] args) {
        JacketZip jacketZip = new JacketZip();
        jacketZip.fasten();
        System.out.println("--------------------------");

        jacketZip.unzip();
        jacketZip.lock();
        jacketZip.lock(jacketZip);
        jacketZip.lock(null);
        System.out.println("==========================");
    }
}
