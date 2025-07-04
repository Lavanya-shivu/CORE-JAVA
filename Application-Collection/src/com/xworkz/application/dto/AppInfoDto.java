package com.xworkz.application.dto;

import java.time.LocalDate;

public class AppInfoDto implements Comparable<AppInfoDto>{

    int id;
    String name;
    AppVersion version;
    LocalDate createdDate;
    double size;
    AppType type;
    boolean isFree;
    double chargePerUser;

    public AppInfoDto(int id,String name, AppVersion version, LocalDate createdDate,double size,AppType type, boolean isFree,double chargePerUser){

        this.id = id;
        this.name = name;
        this.version = version;
        this.createdDate = createdDate;
        this.size = size;
        this.type = type;
        this.isFree = isFree;
        this.chargePerUser = chargePerUser;

    }

    @Override
    public int compareTo(AppInfoDto o) {
        return 0;
    }
}