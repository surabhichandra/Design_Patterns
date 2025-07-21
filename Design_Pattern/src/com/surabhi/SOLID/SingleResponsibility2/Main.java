package com.surabhi.SOLID.SingleResponsibility2;

public class Main {
    public static void main(String[] args) {
        Book book=new Book("George Orwell","1984");

        BookPrinter printer =new BookPrinter();
        printer.printDetails(book);

        BookFileManager fileManager=new BookFileManager();
        fileManager.saveToFile(book);

        LibraryInventoryService inventoryService=new LibraryInventoryService();
        boolean available=inventoryService.isAvailableInLibrary(book);
        System.out.println("Available"+available);

    }
}
