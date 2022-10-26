package org.lfreire.catalog.model;

abstract public class Product implements IProduct{
    protected int price;

    public Product(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public String toString() {
        return "Product{" +
                "price=" + price;
    }
}
