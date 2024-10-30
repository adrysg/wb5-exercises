package com.pluralsight;


public class House extends Asset {

   private String address;
   private int condition = Console.PromptForInt("1 - Excellent, 2 - Good, 3 - Fair, 4 - Poor");
   private int squareFoot;
   private int lotSize;


    public House(String description, String dateAcquired, double originalCost,
                 String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue(){
        double valueHouse = 0;
        double valueLot = 0.25;

        if (condition == 1){
            valueHouse = (180 * squareFoot) + (lotSize * valueLot);
        }
        else if (condition == 2){
            valueHouse = (130 * squareFoot) + (lotSize * valueLot);
        }
        else if (condition == 3){
            valueHouse = (90 * squareFoot) + (lotSize * valueLot);
        }
        else if (condition == 4){
            valueHouse = (80 * squareFoot) + (lotSize * valueLot);
        }

        return valueHouse;
    }

}
