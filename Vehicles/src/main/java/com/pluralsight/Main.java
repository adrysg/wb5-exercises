package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        HoverCraft vehicle1 = new HoverCraft();
        vehicle1.setElectric(true);
        vehicle1.setNumberOfPassengers(6);
        vehicle1.setHoverHeight(2f);

        SemiTruck vehicle2 = new SemiTruck();
        vehicle2.setElectric(false);
        vehicle2.setGasoline(true);
        vehicle2.setHasTrailer(true);

        System.out.println(vehicle1);
        System.out.println(vehicle2);

    }
}