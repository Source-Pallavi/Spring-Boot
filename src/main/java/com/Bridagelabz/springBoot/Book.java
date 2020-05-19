package com.Bridagelabz.springBoot;

public class Book {
    int id;
    String bookName;
    String author;

    public Book(int id, String bookName, String author) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getBookName()
    {
        return bookName;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
