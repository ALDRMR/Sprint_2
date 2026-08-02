package model;
//
//Интерфейс Discountable c единственным методом getDiscount. Он возвращает размер скидки — вещественное число.
//        Все классы, реализующие этот интерфейс, возвращают значение 0 в методе getDiscount, если в задании не указано иное.
//
public interface Discountable {
    float getDiscount();
}
