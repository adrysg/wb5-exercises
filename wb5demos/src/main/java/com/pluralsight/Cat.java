package com.pluralsight;

public class Cat extends Animal {

    public void meow(){
        System.out.println("TRACE -- from Cat constructor");
        System.out.println("MEOW");
    }

    public void sayHello(){
        System.out.println("Meow");
    }

    public void scratch(){
        System.out.println("Skkkkkkkkkkkrsshh");
    }

    public Cat(){
        super("Unnamed");
        super.setSpecies(" Cat");
    }

}
