package org.lfreire.catalog.model.books;

import org.lfreire.catalog.model.Product;

import java.util.Date;

public class Book extends Product implements IBook {
    protected Date publishingDate;
    protected String author;
    protected String title;
    protected String publisher;

    public Book(int price, Date publishingDate, String author, String title, String publisher) {
        super(price);
        this.publishingDate = publishingDate;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
    }

    @Override
    public Date getPublishingDate() {
        return publishingDate;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getPublisher() {
        return publisher;
    }

    @Override
    public double getSellingPrice() {
        return this.price*1.5;
    }

    @Override
    public String toString() {
        return super.toString() + "Book{" +
                "publishingDate=" + publishingDate +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'';
    }
}
