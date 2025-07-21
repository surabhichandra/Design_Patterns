package com.surabhi.SOLID.InterfaceSegregationViolation;

public class MultiPurposePrinter implements Printer{
    @Override
    public void printDocumet() {
        System.out.println("Printing Document");
    }

    @Override
    public void scanDocument() {
        System.out.println("Scanning Document");
    }

    @Override
    public void sendFax() {
        System.out.println("Faxing Document");
    }
}
