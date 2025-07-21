package com.surabhi.SOLID.InterfaceSegregation;

public class SimplePrinter implements Print{
    @Override
    public void printDocument() {
        System.out.println("Printing Document");
    }
}
