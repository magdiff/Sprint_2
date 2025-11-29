import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args){

        Food meat = new Meat(5, 100);
        Food appleRed = new Apple(10, 50, "red");
        Food appleGreen = new Apple(8, 60, "green");

        Food[] cart = {meat, appleRed, appleGreen};
        ShoppingCart shoppingCart = new ShoppingCart(cart);

        System.out.println("Общая сумма товаров без скидки " + shoppingCart.getTotalCostWithoutDiscount() + " рублей.");
        System.out.println("Общая сумма товаров со скидкой " + shoppingCart.getTotalCostWithDiscount() + " рублей.");
        System.out.println("Сумма всех вегетарианских продуктов без скидки " + shoppingCart.getVegetarianCostWithoutDiscount() + " рублей.");
    }
}
