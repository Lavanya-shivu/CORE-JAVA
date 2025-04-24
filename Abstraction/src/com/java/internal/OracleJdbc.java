package com.java.internal;

public class OracleJdbc implements Jdbc {

    @Override
    public void connection() {

        System.out.println("JDBC is connected to MySql");
    }

}

