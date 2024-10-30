package com.pluralsight;

public class Dog extends Animal {

    private String breed;

    public Dog(String name){
        super(name);
        System.out.println("TRACE -- from Dog constructor");
        super.setSpecies(" Dog");
    }

    public void sayHello(){
        System.out.println("Bark");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        if(super.getWeight() < 50){
            System.out.println("BARK");
        }
        else {
            System.out.println("WOOF");
        }
    }
}
