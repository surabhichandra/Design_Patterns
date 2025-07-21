package com.surabhi.SOLID.liskovSubstitutionPrinciple;

public class Square implements Shape{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side*side;
    }
}
