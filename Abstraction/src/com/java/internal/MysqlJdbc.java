package com.java.internal;

public class MysqlJdbc implements Jdbc {

    @Override
    public void connection() {
        System.out.println("JDBC connects MySql");
    }

}


