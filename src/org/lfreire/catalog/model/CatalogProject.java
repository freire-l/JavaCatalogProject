package org.lfreire.catalog.model;

import org.lfreire.catalog.model.books.Book;
import org.lfreire.catalog.model.electronics.TvLcd;

import java.util.Date;

public class CatalogProject {

    public static void main(String[] args) {

        IProduct[] products = new Product[6];

        products[0] = new TvLcd(340000,"Sony", 40);
        products[1] = new Book("1800", Date)
    }


}
