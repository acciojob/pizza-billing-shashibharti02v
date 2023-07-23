package com.driver;

public class Pizza {

    private int totalPrice;
    private Boolean isVeg;
    private String bill;

    private int cheesPrice;
    private int basePrice;
    private int toppingsPrice;
    private int bagPrice;
    boolean isCheesAdded;
    boolean isToppingsAdded;
    boolean isBagPriceAdded;

    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
      if(isVeg){
          basePrice = 300;

          toppingsPrice = 70;
          bagPrice = 20;
      }
      if(!isVeg){
          basePrice = 400;
          cheesPrice = 80;
          toppingsPrice =120;

      }
        cheesPrice = 80;
        bagPrice = 20;
        totalPrice = basePrice;
        bill = "Base Price of the Pizza: "+basePrice +"/n";
    }

    public int getPrice(){
        return this.totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheesAdded == false) {
            totalPrice += cheesPrice;
            isCheesAdded = true;

            bill = bill + "Extra Cheese Added: " + cheesPrice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded == false){
            totalPrice += toppingsPrice;
            isToppingsAdded = true;
            bill = bill + "Extra Toppings Added: "+toppingsPrice;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isBagPriceAdded == false){
            totalPrice += bagPrice;
            isBagPriceAdded = true;
            bill = bill + "Paperbag Added: "+bagPrice;
        }
    }

    public String getBill(){
        // your code goes here

        if(isBillGenerated == false) {
            bill = bill + "Total Price: "+totalPrice;
        }
        return this.bill;
    }
}
