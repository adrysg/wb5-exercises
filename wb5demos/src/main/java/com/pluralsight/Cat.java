package com.pluralsight;

public class Cat extends Animal {

    public void meow(){
        System.out.println("TRACE -- from Cat constructor");
        System.out.println("MEOW");
    }

    public Cat(){
        super("Unnamed");
        super.setSpecies(" Cat");
    }

}
