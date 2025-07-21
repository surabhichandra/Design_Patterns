package com.surabhi.SOLID.SingleResponsibility2;

public class LibraryInventoryService {
    public boolean isAvailableInLibrary(Book book){
        // Dummy logic: Let's assume all books are available for now
        System.out.println("Checking availability for: " + book.getTitle());
        return true;
    }
}
