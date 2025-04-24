package com.java.external;

import com.java.internal.Jdbc;

public class IplApp  {

        private Jdbc jdbc;

        public IplApp(Jdbc jdbc){
        this.jdbc=jdbc;
        }
        public void saveTeamInfo(){
            if(jdbc!= null){
                System.out.println("running App");
                this.jdbc.connection();
            }
            else {
                System.err.println("IplApp");
            }
        }
    }

