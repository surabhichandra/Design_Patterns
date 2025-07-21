package com.surabhi.SOLID.liskovSubstitutionPrinciple;

public class Main {
    public static void main(String[] args) {
        Shape rect=new Rectangle(5,10);
        System.out.println(rect.calculateArea());
        Shape square=new Square(5);
        System.out.println(square.calculateArea());
    }
}
