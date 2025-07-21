package com.surabhi.SOLID.liskovSubstitutionPrincipleViolation;

public class Rectangle {
    protected int width;
    protected int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculateArea(){
        return width*height;
    }
}
