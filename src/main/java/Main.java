import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        // Мясо в количестве 5 кг по цене 100 рублей за кг;
        Meat meat = new Meat(5,100);
        // Яблоки красные в количестве 10 кг по цене 50 рублей;
        Apple appleRed = new Apple(10,50, Colour.RED);
        // Яблоки зелёные в количестве 8 кг по цене 60 рублей.
        Apple appleGreen = new Apple(8,60, Colour.GREEN);

        // Создай массив продуктов из этих элементов и проинициализируй корзину с помощью созданного массива.
        Food[] products = {meat,appleRed,appleGreen};
        ShoppingCart shoppingCart = new ShoppingCart(products);

        // Посчитай и выведи на экран значения для созданной корзины:
        // общую сумму товаров без скидки,
        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.getSumPriceWithoutDiscount());
        //        общую сумму товаров со скидкой,
        System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.getSumPriceWithDiscount());
        // сумму всех вегетарианских продуктов без скидки.
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + shoppingCart.getVegetarianSumPriceWithoutDiscount());

        // Все переменные класса должны быть недоступны извне, если не указано иное.
        // Доступ к ним реализуй через известные тебе методы: создавай только те,
        // которые действительно нужны для реализации описанной функциональности.
    }
}