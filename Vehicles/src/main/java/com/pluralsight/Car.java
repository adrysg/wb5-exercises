package com.pluralsight;

public class Car extends Vehicle {

    private String trunkContents;
    private String airFreshenerType;

    public Car(float speedMax, float speedCurrent, boolean isManual, boolean isElectric, boolean isGasoline,
               String vehicleType, int fuelCapacity, int cargoCapacity, int numberOfPassengers, String color) {
        super(speedMax, speedCurrent, isManual, isElectric, isGasoline, vehicleType, fuelCapacity, cargoCapacity, numberOfPassengers, color);
    }

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
