package org.lfreire.catalog.model.electronics;

public class TvLcd extends Electronics{
    protected int inches;

    public TvLcd(int price, String manufacturer, int inches) {
        super(price, manufacturer);
        this.inches = inches;
    }

    @Override
    public double getSellingPrice() {
        return this.price*1.5;
    }
}
