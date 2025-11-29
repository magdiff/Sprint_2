package model;

import static model.constants.Colour.redColour;
import static model.constants.Discount.noDiscount;
import static model.constants.Discount.redAppleDiscount;

public class Apple extends Food {
    String colour;

    public Apple(int amount, double price, String colour) {
        setAmount(amount);
        setPrice(price);
        setVegetarian(true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (colour == redColour) {
            return redAppleDiscount; // если яблоки красные, возвращаем значение скидки -60%
        } else {
            return noDiscount;  // яблоки не красные, возвращем нулевое значение скидки
        }
    }
}
