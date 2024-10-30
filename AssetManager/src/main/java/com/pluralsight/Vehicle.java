package com.pluralsight;

public class Vehicle extends Asset {

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost,
                   String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        System.out.println("What is your cars age range: ");
        System.out.println("1 - 0-3 years old ");
        System.out.println("2 - 4-6 years old ");
        System.out.println("3 - 7-10 years old ");
        System.out.println("4 - Over 10 years old ");
        int selection = Console.PromptForInt("Enter selection: ");

        double value = 0;
        if(selection == 1){
            value = (0.03 * originalCost) -
        }

    }


}
