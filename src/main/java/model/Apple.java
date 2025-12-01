package model;

import static model.constants.Colour.RED_COLOUR;
import static model.constants.Discount.NO_DISCOUNT;
import static model.constants.Discount.RED_APPLE_DISCOUNT;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        setAmount(amount);
        setPrice(price);
        setVegetarian(true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        return colour.equals(RED_COLOUR)
            ? RED_APPLE_DISCOUNT // если яблоки красные, возвращаем значение скидки -60%
            : NO_DISCOUNT; // яблоки не красные, возвращем нулевое значение скидки
    }
}
