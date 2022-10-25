package org.lfreire.catalog.model.books;

import java.util.Date;

public interface IBook {
    Date getPublishingDate();
    String getAuthor();
    String getTitle();
    String getPublisher();
}
