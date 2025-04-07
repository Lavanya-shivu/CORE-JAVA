package com.java.Village;

public class Village {
        private String name;
        private int no_people;
        private Villagehead v[];

        public Village(String name, int no_people, Villagehead v[]){
            this.name=name;
            this.no_people=no_people;
            this.v=v;
        }
        public void display(){
            System.out.println("name:"+name +"no_people:"+no_people);
        }
    }

