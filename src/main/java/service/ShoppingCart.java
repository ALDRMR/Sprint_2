package service;

import model.Food;

public class ShoppingCart {
    private Food[] foodArray;

    public ShoppingCart(Food[] foodArray){
        this.foodArray = foodArray;
    }

    public float getSumPriceWithoutDiscount(){
        float priceSum = 0;
        for(int i = 0; i < foodArray.length; i++){

            priceSum = priceSum + foodArray[i].getAmount() * foodArray[i].getPrice();
        }
        return priceSum;
    }

    public float getSumPriceWithDiscount(){
        float priceSum = 0;
        for(int i = 0; i < foodArray.length; i++){

            priceSum = priceSum + foodArray[i].getAmount() * foodArray[i].getPrice()
                    * (1 - foodArray[i].getDiscount());

        }
        return priceSum;
    }

    public float getVegetarianSumPriceWithoutDiscount(){
        float priceSum = 0;
        for(int i = 0; i < foodArray.length; i++){
            if(foodArray[i].isVegetarian()) {
                priceSum = priceSum + foodArray[i].getAmount() * foodArray[i].getPrice();
            }

        }
        return priceSum;
    }
}
