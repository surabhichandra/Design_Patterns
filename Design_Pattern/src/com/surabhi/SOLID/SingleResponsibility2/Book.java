package com.surabhi.SOLID.SingleResponsibility2;

public class Book {
    private String title;
    private String author;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
