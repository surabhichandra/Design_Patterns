package com.surabhi.SOLID.SingleResponsibility2;

public class BookPrinter {
    public void printDetails(Book book){
        System.out.println("Title:"+book.getTitle()+", Author: "+ book.getAuthor());
    }
}
