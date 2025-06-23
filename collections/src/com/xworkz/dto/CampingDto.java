package com.xworkz.dto;

public class CampingDto {
    private String tentSize;
    private boolean isStoveStainless;
    private boolean isFlashLightLongLasting;
    private String place;
    private boolean isChairFoldable;

    public CampingDto(String tentSize, boolean isStoveStainless, boolean isFlashLightLongLasting, String place, boolean isChairFoldable){
        this.tentSize=tentSize;
        this.isStoveStainless=isStoveStainless;
        this.isFlashLightLongLasting=isFlashLightLongLasting;
        this.place=place;
        this.isChairFoldable=isChairFoldable;
    }
    @Override
    public String toString() {
        return "CampingDto{"+
                "tentSize'"+'\''+
                ",isStoveStainless'"+'\''+
                ",isFlashLightLongLasting'"+'\''+
                ",place'"+'\''+
                ",isChairFoldable'"+'\''+
                '}';
    }
    public String getTentSize(){
        return tentSize;
    }
    public boolean getIsStoveStainless(){
        return isStoveStainless;
    }
    public boolean getIsFlashLightLongLasting(){
        return isFlashLightLongLasting;
    }
    public String getPlace(){
        return place;
    }
    public  boolean getIsChairFoldable(){
        return isChairFoldable;
    }
}
