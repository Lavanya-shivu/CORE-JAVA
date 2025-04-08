package com.java.internal.PostOffice;

public class PostOffice {

    private String name="India Post";
    private String location = "MG Road";
    private int pincode = 560001;
    private String openTime = "9:00 AM";
    private boolean isGovernment = true;

    //setter or mutator(init)
    void setName(String name) {
        this.name = name;
    }
    void setLocation(String location){
        this.location=location;
    }
    void setPincode(int pincode){
        this.pincode=pincode;
    }
    void setOpenTime(String openTime){
        this.openTime=openTime;
    }
    void setGovernment(boolean isGovernment){
        this.isGovernment=isGovernment;
    }

    //getter or accessor
    public String getName() {
        return null;
    }
    public String getLocation() {
        return location;
    }

    public int getPincode() {
        return pincode;
    }

    public String getOpenTime() {
        return openTime;
    }

    public boolean isGovernment() {
        return isGovernment;
    }
}
