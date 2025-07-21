package com.surabhi.SOLID.liskovSubstitutionPrincipleViolation;

public class Main {
    public static void main(String[] args) {
        Rectangle myRect= new Square();
        myRect.setHeight(5);
        myRect.setWidth(10);
        System.out.println(myRect.calculateArea());//actual 100 expected is 50 hence substitution fails
    }
}
