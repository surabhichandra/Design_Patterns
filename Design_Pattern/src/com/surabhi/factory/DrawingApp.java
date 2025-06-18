package com.surabhi.factory;

public class DrawingApp {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape1= factory.getShape("circle");
        shape1.draw();
        Shape shape2= factory.getShape("SQUARE");
        shape2.draw();
        Shape shape3= factory.getShape("RecTangle");
        shape3.draw();

    }
}
