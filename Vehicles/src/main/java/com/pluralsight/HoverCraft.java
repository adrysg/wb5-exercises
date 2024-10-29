package com.pluralsight;

public class HoverCraft extends Vehicle {

    private boolean onWater;
    private float hoverHeight;

    public HoverCraft(float speedMax, float speedCurrent, boolean isManual, boolean isElectric, boolean isGasoline,
                      String vehicleType, int fuelCapacity, int cargoCapacity, int numberOfPassengers, String color) {
        super(speedMax, speedCurrent, isManual, isElectric, isGasoline, vehicleType, fuelCapacity, cargoCapacity, numberOfPassengers, color);
    }

    public boolean isOnWater() {
        return onWater;
    }

    public void setOnWater(boolean onWater) {
        this.onWater = onWater;
    }

    public float getHoverHeight() {
        return hoverHeight;
    }

    public void setHoverHeight(float hoverHeight) {
        this.hoverHeight = hoverHeight;
    }
}
