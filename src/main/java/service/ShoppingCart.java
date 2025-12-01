package service;
import model.Food;

public class ShoppingCart {
    private Food[] shopCart;
    public ShoppingCart(Food[] shopCart) {
        this.shopCart = shopCart;
    }

    public double getTotalCostWithoutDiscount() {
        double totalCost = 0;
        for (Food food : shopCart) {
            totalCost += food.getAmount() * food.getPrice();
        }
        return totalCost;
    }

    public double getTotalCostWithDiscount() {
        double totalCost = 0;
        for (int i = 0; i < shopCart.length; i++) {
            totalCost += shopCart[i].getAmount() * shopCart[i].getPrice() * ((100 - shopCart[i].getDiscount()) / 100);
        }         // рассчитываем стоимость товара (красные яблоки) с учётом скидки
        return totalCost;
    }

    public double getVegetarianCostWithoutDiscount() {
        double totalCost = 0;
        for (int i = 0; i < shopCart.length; i++) {
            if (shopCart[i].isVegetarian()) {
                totalCost += shopCart[i].getAmount() * shopCart[i].getPrice();
            }
        }
        return totalCost;
    }
}
