package org.lfreire.catalog.model.books;

import java.util.Date;

public class Comics extends Book{
    protected String character;

    public Comics(int price, Date publishingDate, String author, String title, String publisher, String character) {
        super(price, publishingDate, author, title, publisher);
        this.character = character;
    }

    @Override
    public double getSellingPrice() {
        return super.getSellingPrice();
    }

    @Override
    public String toString() {
        return super.toString() + "Comics{" +
                "character='" + character + '\'' +
                '}';
    }
}
