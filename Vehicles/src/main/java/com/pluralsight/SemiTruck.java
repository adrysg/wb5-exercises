package com.pluralsight;

public class SemiTruck extends Vehicle {

    private String cargo;
    private float cargoWeight;
    private boolean hasTrailer;

    public SemiTruck(float speedMax, float speedCurrent, boolean isManual, boolean isElectric, boolean isGasoline,
                     String vehicleType, int fuelCapacity, int cargoCapacity, int numberOfPassengers, String color) {
        super(speedMax, speedCurrent, isManual, isElectric, isGasoline, vehicleType, fuelCapacity, cargoCapacity, numberOfPassengers, color);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(float cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }
}
