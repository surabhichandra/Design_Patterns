package com.surabhi.SOLID.liskovSubstitutionPrinciple;

public class Rectangle implements Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return width*height;
    }
}
