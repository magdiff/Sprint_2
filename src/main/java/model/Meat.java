package model;

import static model.constants.Discount.NO_DISCOUNT;

public class Meat extends Food {

    public Meat(int amount, double price) {
        setAmount(amount);                  // конструктор с двумя входными параметрами
        setPrice(price);
        setVegetarian(false);               // и флагом, устанавливающим правильное значение (продукт не вегетарианский)
    }

    @Override
    public double getDiscount() {
        return NO_DISCOUNT;
    } // на мясо в данный момент скидки нет
}
