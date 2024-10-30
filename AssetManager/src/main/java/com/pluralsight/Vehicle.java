package com.pluralsight;


public class Vehicle extends Asset {

    private String makeModel;
    private String year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost,
                   String makeModel, String year, int odometer) {
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
       int currentYear = 2024;
       int ageRange = currentYear - Integer.parseInt(year);
       double value = 0;

        if (ageRange <= 3) {
            value = (0.03 * ageRange);
        }
        else if (ageRange >= 4 && ageRange <= 6) {
            value = 0.06 * ageRange;
        }
        else if (ageRange >= 7 && ageRange <= 10) {
            value = 0.08 * ageRange;
        }
        else if (ageRange > 10) {
            return 1000;
        }

        double currentValue = getOriginalCost() * (1 - value);
        if (odometer > 100000 && !makeModel.toLowerCase().contains("Honda") && !makeModel.toLowerCase().contains("Toyota")) {
            currentValue *= 0.75;
        }
        return currentValue;
    }

}
