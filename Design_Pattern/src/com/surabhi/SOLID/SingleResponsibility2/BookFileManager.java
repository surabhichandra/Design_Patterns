package com.surabhi.SOLID.SingleResponsibility2;

public class BookFileManager {
    public void saveToFile(Book book){
        // Just a dummy print for now — no actual file code
        System.out.println("Saving book to file: " + book.getTitle() + " by " + book.getAuthor());
    }
}
