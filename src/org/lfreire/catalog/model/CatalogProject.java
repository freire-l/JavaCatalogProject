package org.lfreire.catalog.model;

import org.lfreire.catalog.model.books.Book;
import org.lfreire.catalog.model.books.Comics;
import org.lfreire.catalog.model.electronics.IPhone;
import org.lfreire.catalog.model.electronics.TvLcd;

import java.text.DateFormat;
import java.util.Date;

public class CatalogProject {

    public static void main(String[] args) {

        IProduct[] products = new Product[4];

        products[0] = new TvLcd(340000,"Sony", 40);
        products[1] = new Book(1800, new Date(), "Eric Gamma", "Sustainable farming", "Schollastic");
        products[2] = new Comics(12000, new Date(), "Stan Lee", "Iron Man Returns", "Marvel Comics", "Iron man");
        products[3] = new IPhone(24000, "Apple", "Iphone 6", "Space Grey");

        for (IProduct product:products) {
            System.out.println(product);

        }
    }


}
