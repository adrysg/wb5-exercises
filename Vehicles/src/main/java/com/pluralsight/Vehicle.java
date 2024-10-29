package com.pluralsight;

import java.io.PrintWriter;

public class Vehicle {

    String color;
    int numberOfPassengers;
    int cargoCapacity;
    int fuelCapacity;
    String vehicleType;
    boolean isGasoline;
    boolean isElectric;
    boolean isManual;
    float speedCurrent;
    float speedMax;


    public Vehicle(float speedMax, float speedCurrent, boolean isManual, boolean isElectric, boolean isGasoline,
                   String vehicleType, int fuelCapacity, int cargoCapacity, int numberOfPassengers, String color) {
        this.speedMax = speedMax;
        this.speedCurrent = speedCurrent;
        this.isManual = isManual;
        this.isElectric = isElectric;
        this.isGasoline = isGasoline;
        this.vehicleType = vehicleType;
        this.fuelCapacity = fuelCapacity;
        this.cargoCapacity = cargoCapacity;
        this.numberOfPassengers = numberOfPassengers;
        this.color = color;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isGasoline() {
        return isGasoline;
    }

    public void setGasoline(boolean gasoline) {
        isGasoline = gasoline;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public float getSpeedCurrent() {
        return speedCurrent;
    }

    public void setSpeedCurrent(float speedCurrent) {
        this.speedCurrent = speedCurrent;
    }

    public float getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(float speedMax) {
        this.speedMax = speedMax;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
