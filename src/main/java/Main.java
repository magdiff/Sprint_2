import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        final Food MEAT = new Meat(5, 100);
        final Food APPLE_RED = new Apple(10, 50, "red");
        final Food APPLE_GREEN = new Apple(8, 60, "green");

        Food[] cart = {MEAT, APPLE_RED, APPLE_GREEN};
        ShoppingCart shoppingCart = new ShoppingCart(cart);

        System.out.printf(
            "Общая сумма товаров без скидки %s рублей.%n" +
            "Общая сумма товаров со скидкой %s рублей.%n" +
            "Сумма всех вегетарианских продуктов без скидки %s рублей.",
            shoppingCart.getTotalCostWithoutDiscount(),
            shoppingCart.getTotalCostWithDiscount(),
            shoppingCart.getVegetarianCostWithoutDiscount()
        );
    }
}
