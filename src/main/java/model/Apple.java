package model;

// Класс Apple — для яблок.
// У него есть ещё строковое поле colour — цвет яблок.
// Конструктор принимает три параметра: количество, цену и цвет яблок — и устанавливает флаг isVegetarian.
// Для красных яблок (colour равно "red") скидка должна быть равна 60%: соответствующий метод возвращает значение 60.

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food{
    private final String colour;

    public Apple(int amount,float price,String colour){
        super(amount, price,  true);
        this.colour = colour;
    }

    @Override
    public float getDiscount() {
        if(colour.equals(Colour.RED)){
            return Discount.RED_APPLE_DISCOUNT;
        }
        return super.getDiscount();
    }
}
