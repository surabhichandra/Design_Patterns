package com.surabhi.SOLID.openClosePrincipleViolation;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int Addition(){
        return a+b;
    }

    public int Subtraction(){
        return a-b;
    }
    //to add another method for multiplication we need to make changes in this class only
    public int Multiplication(){
        return a*b;
    }
}
