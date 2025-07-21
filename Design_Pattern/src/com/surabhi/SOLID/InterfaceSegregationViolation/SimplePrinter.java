package com.surabhi.SOLID.InterfaceSegregationViolation;

public class SimplePrinter implements Printer{
    @Override
    public void printDocumet() {
        System.out.println("Printing document");
    }

    @Override
    public void scanDocument() throws UnsupportedOperationException{
        throw new UnsupportedOperationException("Scanning not supported");

    }

    @Override
    public void sendFax() throws UnsupportedOperationException{
        throw new UnsupportedOperationException("Sending fax not supported");

    }
}
