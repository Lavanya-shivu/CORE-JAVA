package com.xworkz.dto;

public class AppliancesDto {
    private String type;
    private String powerSource;
    private String function;
    private double price;
    private String portability;

    public AppliancesDto(String type,String powerSource,String function,double price,String portability){
        this.type=type;
        this.powerSource=powerSource;
        this.function=function;
        this.price=price;
        this.portability=portability;
    }

    @Override
    public String toString() {
        return "AppliancesDto{"+
                "type='"+type+'\''+
                ",powerSource='"+powerSource+'\''+
                ",function='"+function+'\''+
                ",price="+price+
                ",portability='"+portability+'\''+
                '}';
    }

    public String getType() {
        return type;
    }
    public String getPowerSource(){
        return powerSource;
    }
    public String getFunction(){
        return function;
    }
    public double getPrice(){
        return price;
    }
    public String getPortability(){
        return portability;
    }
}
