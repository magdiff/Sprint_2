package model;

public abstract class Food implements Discountable {
    protected int amount; // количество продукта в килограммах (целое число)
    protected double price; // цена за единицу продукта (вещественное число)
    protected boolean isVegetarian; // флаг, показывающий, вегетарианский ли продукт


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) { this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) { this.price = price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) { isVegetarian = vegetarian;
    }

}
