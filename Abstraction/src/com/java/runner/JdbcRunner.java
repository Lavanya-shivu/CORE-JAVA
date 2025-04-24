package com.java.runner;

import com.java.external.IplApp;
import com.java.internal.Jdbc;
import com.java.internal.MysqlJdbc;

public class JdbcRunner {
    public static void main(String[] args) {
        Jdbc jdbc = new MysqlJdbc();

        IplApp iplApp = new IplApp(jdbc);
        iplApp.saveTeamInfo();
    }
}
