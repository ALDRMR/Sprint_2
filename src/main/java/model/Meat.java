package model;

// Класс Meat — для мяса. Это класс с конструктором.
// Конструктор принимает два входных параметра — количество и цену.
// И устанавливает для флага isVegetarian правильное значение.

public class Meat extends Food{
    public Meat(int amount,float price){
        this.amount = amount;
        this.price = price;
        this.isVegetarian = false;
    }
}
