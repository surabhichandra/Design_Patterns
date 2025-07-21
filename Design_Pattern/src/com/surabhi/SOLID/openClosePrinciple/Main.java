package com.surabhi.SOLID.openClosePrinciple;

public class Main {
    public static void main(String[] args) {
        Calculator addition =new Addition();
        System.out.println(addition.Calculate(1,5));
        Calculator multi =new Multiply();
        System.out.println(multi.Calculate(1,5));
        Calculator subtraction =new Subtraction();
        System.out.println(subtraction.Calculate(1,5));
    }
}
