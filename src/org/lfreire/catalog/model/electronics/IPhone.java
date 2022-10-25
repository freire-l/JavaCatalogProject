package org.lfreire.catalog.model.electronics;

public class IPhone extends Electronics{
    protected String model;
    protected String color;

    public IPhone(int price, String manufacturer, String model, String color) {
        super(price, manufacturer);
        this.model = model;
        this.color = color;
    }

    @Override
    public double getSellingPrice() {
        return this.price*1.5;
    }
}
