package com.pluralsight;

public class Moped extends Vehicle{

   private String underseatStorage;

    public Moped(float speedMax, float speedCurrent, boolean isManual, boolean isElectric, boolean isGasoline,
                 String vehicleType, int fuelCapacity, int cargoCapacity, int numberOfPassengers, String color,
                 String underseatStorage) {

        super(speedMax, speedCurrent, isManual, isElectric, isGasoline, vehicleType, fuelCapacity, cargoCapacity, numberOfPassengers, color);
        this.underseatStorage = underseatStorage;
    }

    public String getUnderseatStorage() {
        return underseatStorage;
    }

    public void setUnderseatStorage(String underseatStorage) {
        this.underseatStorage = underseatStorage;
    }
}
