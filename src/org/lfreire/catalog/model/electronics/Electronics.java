package org.lfreire.catalog.model.electronics;

import org.lfreire.catalog.model.Product;

abstract public class Electronics extends Product implements IElectronics{
    protected String manufacturer;

    public Electronics(int price, String manufacturer) {
        super(price);
        this.manufacturer = manufacturer;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }
}
