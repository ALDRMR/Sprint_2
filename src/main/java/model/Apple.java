package model;

// Класс Apple — для яблок.
// У него есть ещё строковое поле colour — цвет яблок.
// Конструктор принимает три параметра: количество, цену и цвет яблок — и устанавливает флаг isVegetarian.
// Для красных яблок (colour равно "red") скидка должна быть равна 60%: соответствующий метод возвращает значение 60.

import model.constants.Colour;
import model.constants.Discount;

import java.util.Objects;

public class Apple extends Food{
    String colour;
    public Apple(int amount,float price,String colour){
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    @Override
    public float getDiscount() {
        if(colour.equals(Colour.RED)){
            return Discount.RED_APPLE_DISCOUNT;
        }
        return super.getDiscount();
    }
}
