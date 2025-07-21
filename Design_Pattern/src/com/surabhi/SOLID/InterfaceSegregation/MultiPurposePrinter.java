package com.surabhi.SOLID.InterfaceSegregation;

public class MultiPurposePrinter implements Print, Scan, Fax{
    @Override
    public void sendFax() {
        System.out.println("Sending Fax");
    }

    @Override
    public void printDocument() {
        System.out.println("Printing Document");
    }

    @Override
    public void scanDocument() {
        System.out.println("Scanning Document");
    }
}
