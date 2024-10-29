package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        HoverCraft vehicle1 = new HoverCraft(85, 50, true, false, true,
                "HoverCraft", 100, 10000, 5, "Black" );

        vehicle1.setElectric(true);
        vehicle1.setNumberOfPassengers(6);
        vehicle1.setHoverHeight(2f);

        SemiTruck vehicle2 = new SemiTruck(75, 40, false, true, false,
                "SemiTruck", 300, 80000, 4, "Purple");

        vehicle2.setElectric(false);
        vehicle2.setGasoline(true);
        vehicle2.setHasTrailer(true);

        System.out.println(vehicle1);
        System.out.println(vehicle2);

    }
}