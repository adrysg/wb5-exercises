package com.pluralsight;

public class Car extends Vehicle {

    private String trunkContents;
    private String airFreshenerType;

    public String getTrunkContents() {
        return trunkContents;
    }

    public void setTrunkContents(String trunkContents) {
        this.trunkContents = trunkContents;
    }

    public String getAirFreshenerType() {
        return airFreshenerType;
    }

    public void setAirFreshenerType(String airFreshenerType) {
        this.airFreshenerType = airFreshenerType;
    }
}
