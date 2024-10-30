package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        Asset a1 = new Asset("Golden Necklace", "1998", 250);
        assets.add(a1);

        House h1 = new House("Current home", "2008", 250000, "818 Main St", 2, 2500, 6000);
        House h2 = new House("Vacation Home", "2022", 200000, "1120 Simpson St", 1, 3000, 7000);
        assets.add(h1);
        assets.add(h2);

        Vehicle v1 = new Vehicle("Personal Vehicle", "2023", 80000, "Land Rover Range Rover Sport", "2022", 4500 );
        Vehicle v2 = new Vehicle("Mom van", "2020", 42000, "Honda Odyssey", "2017", 10000);
        assets.add(v1);
        assets.add(v2);

       double networth = 0;
        for(Asset a : assets){
            System.out.println(a.getDescription() + " Acquired in " + a.getDateAcquired() + " for " + a.getOriginalCost() + " is now worth: " + a.getValue());
            networth += a.getValue();
        }

        System.out.println("Total net worth: " + networth);
    }


}