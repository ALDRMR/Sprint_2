package model;

//Класс Food — абстрактный класс с полями:
//amount — количество продукта в килограммах (целое число);
//price — цена за единицу (вещественное число);
//isVegetarian — флаг, который показывает, вегетарианский ли продукт.
//Поля должны быть доступны только из классов-потомков.

import model.constants.Discount;

public abstract class Food implements Discountable{
    protected int amount;
    protected float price;
    protected boolean isVegetarian;

    @Override
    public float getDiscount() {
        return Discount.DEFAULT_DISCOUNT;
    }

    public int getAmount(){
        return amount;
    }

    public float getPrice(){
        return price;
    }

    public boolean isVegetarian(){
        return isVegetarian;
    }
}
